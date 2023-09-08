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

    @ManyToOne(cascade = {CascadeType.ALL})
    private Member writer;

    public void changeTitle(String title){
        this.title = title;
    }
    public void changeContent(String content){
        this.content = content;
    }

}

