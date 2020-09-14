package com.min.service.springboot.dto;

import com.min.service.springboot.domain.posts.Posts;
import com.min.service.springboot.domain.posts.PostsRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author){

        this.title = title;
        this.content = content;
        this.author = author;

    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
