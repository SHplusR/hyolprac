package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Member;
import com.example.hyolprac.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply,Integer> {
}
