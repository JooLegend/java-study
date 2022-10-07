package com.sparta.springhomework.dto;

import com.sparta.springhomework.domain.Post;
import lombok.Getter;

@Getter
public class ResponseDto {
    private String title;

    public ResponseDto(Post post) {
        this.title = post.getTitle();
    }
}
