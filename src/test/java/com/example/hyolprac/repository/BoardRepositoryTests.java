package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Board;
import com.example.hyolprac.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {
    @Autowired
    BoardRepository boardRepository;
    @Test
    public void insertdummies(){
        IntStream.range(1,100).forEach(i ->{
            Board board = Board.builder()
                    .title("Title..."+i)
                    .content("content is...."+i)
                    .id("user"+i)
                    .recommend(1)
                    .replyCount(0)
                    .build();
            boardRepository.save(board);
        });
    }
}
