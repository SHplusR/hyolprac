package com.example.hyolprac.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Reply extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rno;
    private String content;
    @ManyToOne(cascade = {CascadeType.ALL})
    private Board board;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Member replyer;

    public void changeContent(String content){
        this.content = content;
    }
}
