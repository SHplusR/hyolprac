package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Board;
import com.example.hyolprac.repository.search.SearchBoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board,Long>, SearchBoardRepository {
//    @Query("select b,w from Board b left join b.writer w where b.bno=:bno")
//    Object getBoardWithWriter(@Param("bno") Long bno);
    @Query("select b,w from Board b left join b.writer w where b.bno=:bno")
    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);

}
