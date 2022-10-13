package com.sparta.springtoken.dto;

import com.sparta.springtoken.model.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CommentDto {
    private Long commentid;
    private String title;
    private String contents;

    public CommentDto(Comment comment){
        this.title = comment.getTitle();
        this.contents = comment.getContents();
    }
}
