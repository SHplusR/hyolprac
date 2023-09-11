package com.example.hyolprac.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchBoardRepository {
    Page<Object[]> searchPage(String type, String keyword, Pageable pageable);
}
