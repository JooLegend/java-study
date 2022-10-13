package com.sparta.springtoken.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sparta.springtoken.dto.CommentDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Comment {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long commentid;

    @Column(nullable = false)
    private String title;

    @JsonIgnore
    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public Comment(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public Comment(CommentDto commentDto){
        this.title = commentDto.getTitle();
        this.contents = commentDto.getContents();
    }

    public Comment(CommentDto commentDto, Post post){
        this.title = commentDto.getTitle();
        this.contents = commentDto.getContents();
        this.post = post;

    }

    public void update(CommentDto commentDto){
        this.title = commentDto.getTitle();
        this.contents = commentDto.getContents();
    }
}
