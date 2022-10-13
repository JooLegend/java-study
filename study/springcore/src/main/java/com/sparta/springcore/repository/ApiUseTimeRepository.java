package com.sparta.springcore.repository;

import com.sparta.springcore.entity.ApiUseTime;
import com.sparta.springcore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}