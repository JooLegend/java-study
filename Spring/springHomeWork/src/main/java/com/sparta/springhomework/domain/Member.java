package com.sparta.springhomework.domain;

import com.sparta.springhomework.dto.MemberRequsetDto;
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
    private String username;
    private String email;
    private String password;

    public Member(MemberRequsetDto memberRequsetDto){
        this.username = memberRequsetDto.getUsername();
        this.email = memberRequsetDto.getEmail();
        this.password = memberRequsetDto.getPassword();
    }

}
