package com.sparta.springhomework.repository;

import com.sparta.springhomework.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
