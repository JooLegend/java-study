package com.sparta.springmember.service;

import com.sparta.springmember.domain.Member;
import com.sparta.springmember.dto.MemberInfoResponseDto;
import com.sparta.springmember.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;


    public Member register(MemberInfoResponseDto memberInfoResponseDto) {
        Member member = new Member(memberInfoResponseDto);
        return memberRepository.save(member);
    }

    public List<Member> getmembers() {
        return memberRepository.findAll();

    }

    public Optional<Member> getmember(Long id) {
       return memberRepository.findById(id);
    }
}
