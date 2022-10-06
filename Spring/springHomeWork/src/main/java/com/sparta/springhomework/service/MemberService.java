package com.sparta.springhomework.service;

import com.sparta.springhomework.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private MemberRepository memberRepository;
}
