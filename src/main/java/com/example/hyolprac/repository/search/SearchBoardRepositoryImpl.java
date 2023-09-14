package com.example.hyolprac.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class SearchBoardRepositoryImpl implements SearchBoardRepository{
    @Override
    public Page<Object[]> searchPage(String type, String keyword, Pageable pageable) {
        return null;
    }
}
