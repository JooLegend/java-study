package com.sparta.springtoken.service;

import com.sparta.springtoken.dto.CommentDto;
import com.sparta.springtoken.dto.PostRequestDto;
import com.sparta.springtoken.model.Comment;
import com.sparta.springtoken.model.Post;
import com.sparta.springtoken.repository.CommentRepository;
import com.sparta.springtoken.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public void save(@PathVariable Long id, CommentDto commentDto){
        Post post = postRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("게시글을 찾을 수 없습니다."));
        Comment comment = new Comment(commentDto,post);
        commentRepository.save(comment);
    }

    @Transactional
    public Long update(Long postid, CommentDto commentDto) {
        Comment comment = commentRepository.findById(postid).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        comment.update(commentDto);
        return comment.getCommentid();
    }
}
