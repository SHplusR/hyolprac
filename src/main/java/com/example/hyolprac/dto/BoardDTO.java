package com.example.hyolprac.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private int bno; //보드번호
    private String title; // 게시글 제목
    private String id; //게시글 작성자
    private String content; //게시글 내용
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount; //게시글 댓글 개수
    private int recommend; //게시글 추천 수
}

