package com.sparta.springtoken.service;

import com.sparta.springtoken.dto.PostRequestDto;
import com.sparta.springtoken.model.Post;
import com.sparta.springtoken.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {


    private final PostRepository postRepository;

    @Transactional
    public Long update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        post.update(requestDto);
        return post.getId();
    }

    public boolean pwCheck(Long id, String password){
        Post post = postRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("해당 회원이 존재하지 않습니다.")
        );
        String realpassword = post.getPassword();
        return realpassword.equals(password);
//        String realPassword = post.getPassword();
//        boolean matches = encoder.matches(password,realPassword);
//        return matches;
    }
}