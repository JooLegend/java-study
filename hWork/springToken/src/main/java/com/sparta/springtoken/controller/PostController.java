package com.sparta.springtoken.controller;

import com.sparta.springtoken.dto.PostRequestDto;
import com.sparta.springtoken.model.Post;
import com.sparta.springtoken.repository.PostRepository;
import com.sparta.springtoken.service.PostService;
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
