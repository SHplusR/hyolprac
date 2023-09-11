package com.example.hyolprac.service;

import com.example.hyolprac.dto.BoardDTO;
import com.example.hyolprac.dto.PageRequestDTO;
import com.example.hyolprac.dto.PageResultDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;
//    @Test
//    public void testList(){
//        PageRequestDTO pageRequestDTO = new PageRequestDTO();
//        PageResultDTO<BoardDTO,Object[]> result = boardService.getList(pageRequestDTO);
//
//        for(BoardDTO boardDTO : result.getDtoList()){
//            System.out.println(boardDTO);
//        }
//    }
}
