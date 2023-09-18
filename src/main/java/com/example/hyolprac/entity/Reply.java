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

    //여러개의 댓글이 한 게시글에 달릴 수 있으므로
    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;

    //여러개의 댓글을 한 유저가 쓸 수 있으므로
    @ManyToOne(fetch = FetchType.LAZY)
    private Member replyer;

    public void changeContent(String content){
        this.content = content;
    }
}
