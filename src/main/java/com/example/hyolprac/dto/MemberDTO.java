package com.example.hyolprac.dto;
import lombok.*;
@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {

    private int mno;
    private String lastname;
    private String firstname;

    private String species;
    private String id;
    private String pwd;
    private String birth;
}


