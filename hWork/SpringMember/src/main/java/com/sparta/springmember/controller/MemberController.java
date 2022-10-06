package com.sparta.springmember.controller;

import com.sparta.springmember.domain.Member;
import com.sparta.springmember.dto.MemberInfoResponseDto;
import com.sparta.springmember.repository.MemberRepository;
import com.sparta.springmember.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController

public class MemberController {
    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @PostMapping("/api/member")
    public Member Register(@RequestBody MemberInfoResponseDto memberInfoResponseDto){
        return memberService.register(memberInfoResponseDto);
    }

    @GetMapping("/api/member")
    public List<Member> GetMembers(){
        return memberService.getmembers();
    }

    @GetMapping("/api/member/{id}")
    public Optional<Member> GetMember(@PathVariable Long id){
        return memberService.getmember(id);

    }
}
