package com.sparta.springtoken.service;

import com.sparta.springtoken.dto.MemberResponseDto;
import com.sparta.springtoken.dto.SignupRequestDto;
import com.sparta.springtoken.model.Authority;
import com.sparta.springtoken.model.Member;
import com.sparta.springtoken.repository.UserRepository;
import com.sparta.springtoken.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public static final String p1 = "^[A-Za-z[0-9]]{4,12}$";
    public static final String p2 = "^[a-z[0-9]]{4,32}$";

    Matcher m;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean registerUser(SignupRequestDto requestDto, Long id, String pw) {
        Pattern username = Pattern.compile("^[A-Za-z[0-9]]{4,12}$");
        String name = requestDto.getUsername();
        Matcher matcher = username.matcher(name);

        if (!(matcher.matches())){
            return false;
        }

        Pattern password = Pattern.compile("^[a-z[0-9]]{4,32}$");
        String passwords = requestDto.getPassword();
        Matcher matchers = password.matcher(passwords);
        if (!(matchers.matches())){
            return false;
        }

        if (!(passwords.equals(requestDto.getPasswords()))){
            return false;
        }


        // 패스워드 암호화
        passwords = passwordEncoder.encode(passwords);
        Authority authority = Authority.ROLE_ADMIN;

        Member member = new Member(name, passwords, authority);
        userRepository.save(member);

        return true;
    }

    public boolean pwCheck(Long id, String pw){
        Member member = userRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("해당 회원이 존재하지 않습니다.")
        );
        String realpassword = member.getPassword();
        return realpassword.equals(pw);
    }

    @Transactional(readOnly = true)
    public MemberResponseDto getMemberInfo(String username) {
        return userRepository.findByUsername(username)
                .map(MemberResponseDto::of)
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));
    }

    // 현재 SecurityContext 에 있는 유저 정보 가져오기
    @Transactional(readOnly = true)
    public MemberResponseDto getMyInfo() {
        return userRepository.findById(SecurityUtil.getCurrentMemberId())
                .map(MemberResponseDto::of)
                .orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다."));
    }
}
