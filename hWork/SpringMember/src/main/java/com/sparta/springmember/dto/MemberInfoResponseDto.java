package com.sparta.springmember.dto;

import com.sparta.springmember.domain.Member;
import lombok.Getter;

@Getter
public class MemberInfoResponseDto {
    private String name;
    private String email;
    private String pw;

}
