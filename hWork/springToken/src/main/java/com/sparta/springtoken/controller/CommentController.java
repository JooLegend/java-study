package com.sparta.springtoken.controller;

import com.sparta.springtoken.dto.CommentDto;
import com.sparta.springtoken.dto.PostRequestDto;
import com.sparta.springtoken.model.Comment;
import com.sparta.springtoken.model.Post;
import com.sparta.springtoken.repository.CommentRepository;
import com.sparta.springtoken.repository.PostRepository;
import com.sparta.springtoken.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/api")
public class CommentController {
    private final CommentRepository commentRepository;
    private final CommentService commentService;
    private final PostRepository postRepository;

    @PostMapping("/api/comments/{id}")
    public void save(@PathVariable Long id,@RequestBody CommentDto commentDto){
        commentService.save(id,commentDto);
    }
    @GetMapping("/api/comments")
    public List<Comment> getcomments() {
        return commentRepository.findAll();
    }

    @PutMapping("/api/comments/{id}")
    public Long updatecomments(@PathVariable Long commentid, @RequestBody CommentDto commentDto) {
        commentService.update(commentid, commentDto);
        return commentid;
    }

    @DeleteMapping("/api/comments/{id}")
    public Long deletecommentss(@PathVariable Long commentid) {
        commentRepository.deleteById(commentid);
        return commentid;
    }
}
