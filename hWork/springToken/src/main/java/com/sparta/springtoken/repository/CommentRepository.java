package com.sparta.springtoken.repository;

import com.sparta.springtoken.model.Comment;
import com.sparta.springtoken.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(Long postId);
}
