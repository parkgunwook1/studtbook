package com.studybook.springboot.web.dto;

import com.studybook.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifieDate;

    public PostsResponseDto (Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifieDate = entity.getModifiedDate();
    }
}
