package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface MemberRepository extends JpaRepository<Member,Integer> {
//    Optional<Member> findById(String id);
Optional<Member> findById(String id);
}
