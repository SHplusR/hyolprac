package com.example.hyolprac.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {

    private Long bno;
    private String id;
    private String title;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount;
    private int recommend;
}

