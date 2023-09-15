package com.example.hyolprac.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    private int rno; //댓글 번호
    private String content; //댓글 내용
    private String id; //댓글 쓰신 분?
    private int bno; //댓글이 달린 글 번호
}
