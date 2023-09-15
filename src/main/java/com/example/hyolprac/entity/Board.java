package com.example.hyolprac.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bno;
    private String content;
    private String id;
    private String title;
    private int recommend;

    private int replyCount;

    //여러개의 보드를 한 유저가 쓸 수 있으므로
    @ManyToOne(cascade = {CascadeType.ALL})
    private Member writer;

    public void changeTitle(String title){
        this.title = title;
    }
    public void changeContent(String content){
        this.content = content;
    }

}

