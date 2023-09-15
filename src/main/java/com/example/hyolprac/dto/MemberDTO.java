package com.example.hyolprac.dto;
import lombok.*;
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private int mno; //유저넘버
    private String lastname; //유저 성
    private String firstname; //유저 이름

    private String species; //유저 종
    private String id; //유저 id
    private String pwd; // 유저 pwd
    private String birth; //유저 생년월일
}


