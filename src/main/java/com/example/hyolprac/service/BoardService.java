package com.example.hyolprac.service;

import com.example.hyolprac.dto.BoardDTO;
import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.dto.PageRequestDTO;
import com.example.hyolprac.dto.PageResultDTO;
import com.example.hyolprac.entity.Board;
import com.example.hyolprac.entity.Member;
import com.example.hyolprac.entity.Reply;

public interface BoardService {

    int register(BoardDTO dto);
    PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);
    default Board dtoToEntity(BoardDTO dto){
        Board board = Board.builder()
                .content(dto.getContent())
                .id(dto.getId())
                .title(dto.getTitle())
                .recommend(dto.getRecommend())
                .replyCount(dto.getReplyCount())
                .build();
        return board;
    }

    default BoardDTO entityToDto(Board board, Member member){
          BoardDTO boardDTO = BoardDTO.builder()
                .bno(board.getBno())
                .title(board.getTitle())
                .content(board.getContent())
                .id(member.getId())
                .recommend(board.getRecommend())
                .replyCount(board.getReplyCount())
                .build();
        return boardDTO;
    }
}
