package com.example.hyolprac.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;
    private String lastname;
    private String firstname;
    private String species;
    private String id;
    private String pwd;
    private String birth;
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    public List<Board> boardList;
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    public List<Reply> replyList;
}
