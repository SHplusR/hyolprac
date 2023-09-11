package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Board;
import com.example.hyolprac.entity.Member;
import com.example.hyolprac.entity.Reply;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class ReplyRepositoryTests {
    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void insertdummies(){
        IntStream.rangeClosed(1,300).forEach(i ->{
            int bno = (int)(Math.random() * 100)+1;
            int mno = (int)(Math.random() * 100)+1;
            Board board = Board.builder().bno(bno).build();
            Member member = Member.builder().id("user"+mno).build();
            Reply reply = Reply.builder()
                    .content("reply,,,,,,"+i)
                    .board(board)
                    .replyer(member)
                    .build();
            replyRepository.save(reply);
        });
    }
}
