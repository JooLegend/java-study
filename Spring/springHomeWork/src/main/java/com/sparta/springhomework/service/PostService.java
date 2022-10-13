package com.sparta.springhomework.service;

import com.sparta.springhomework.domain.Post;
import com.sparta.springhomework.dto.PostRequestDto;
import com.sparta.springhomework.dto.ResponseDto;
import com.sparta.springhomework.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
