package com.sparta.springmember.domain;

import com.sparta.springmember.dto.MemberInfoResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity
public class Member {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;
    private String email;
    private String pw;

    public Member(MemberInfoResponseDto memberInfoResponseDto){
        this.name = memberInfoResponseDto.getName();
        this.email = memberInfoResponseDto.getEmail();
        this.pw = memberInfoResponseDto.getPw();
    }
}
