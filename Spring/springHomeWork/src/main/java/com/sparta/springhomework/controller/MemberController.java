package com.sparta.springhomework.controller;

import com.sparta.springhomework.domain.Member;
import com.sparta.springhomework.domain.Post;
import com.sparta.springhomework.dto.MemberRequsetDto;
import com.sparta.springhomework.repository.MemberRepository;
import com.sparta.springhomework.repository.PostRepository;
import com.sparta.springhomework.service.MemberService;
import com.sparta.springhomework.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @PostMapping("/api/member")
    public Member Register(@RequestBody MemberRequsetDto memberRequsetDto){
        Member member = new Member(memberRequsetDto);
        return memberRepository.save(member);
    }

    @GetMapping("/api/member/{id}")
    public Member GetMember(@PathVariable Long id, MemberRequsetDto memberRequsetDto){
        Member member = memberRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        return member;
    }

}
