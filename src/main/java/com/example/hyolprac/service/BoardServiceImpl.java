package com.example.hyolprac.service;

import com.example.hyolprac.dto.BoardDTO;
import com.example.hyolprac.dto.PageRequestDTO;
import com.example.hyolprac.dto.PageResultDTO;
import com.example.hyolprac.entity.Board;
import com.example.hyolprac.entity.Member;
import com.example.hyolprac.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;
    @Override
    public int register(BoardDTO dto) {
        Board board = dtoToEntity(dto);
        boardRepository.save(board);
        return board.getBno();
    }

    @Override
    public PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO) {
        Function<Object[], BoardDTO> fn = (en -> entityToDto((Board)en[0],(Member)en[1]));
        Page<Object[]> result = boardRepository.searchPage(
                pageRequestDTO.getType(),
                pageRequestDTO.getKeyword(),
                pageRequestDTO.getPageable(Sort.by("bno").descending())
        );
                return new PageResultDTO<>(result,fn);
    }
}
