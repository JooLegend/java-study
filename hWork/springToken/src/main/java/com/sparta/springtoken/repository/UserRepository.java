package com.sparta.springtoken.repository;


import com.sparta.springtoken.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    Optional<Member> findByPassword(String password);
    boolean existsByUsername(String username);
}
