package com.sparta.springhomework.controller;

import com.sparta.springhomework.domain.Post;
import com.sparta.springhomework.dto.PostRequestDto;
import com.sparta.springhomework.repository.PostRepository;
import com.sparta.springhomework.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PostController extends Post {

    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/posts")
    public Post createMemo(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @GetMapping("/api/posts")
    public List<Post> getposts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }
    @GetMapping("/api/posts/{id}")
    public Optional<Post> getpost(@PathVariable Long id) {
        return postRepository.findById(id);
    }

    @PostMapping("/api/posts/{id}")
    public boolean passwordCheck(@PathVariable Long id,@RequestBody PostRequestDto requestDto) {
        return postService.pwCheck(id,requestDto.getPassword());
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        postService.update(id, requestDto);
        return id;
    }
}