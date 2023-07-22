package com.example.hyolprac.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    private int rno;
    private String content;
    private String id;
    private int bno;
}
