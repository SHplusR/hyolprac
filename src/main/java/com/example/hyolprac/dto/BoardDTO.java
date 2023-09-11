package com.example.hyolprac.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private int bno;
    private String title;
    private String id;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount;
    private int recommend;
}

