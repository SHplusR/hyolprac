package com.example.hyolprac.repository;

import com.example.hyolprac.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1,100).forEach(i ->{
            Member member = Member.builder()
                    .lastname("user"+i+"lastname")
                    .firstname("user"+i+"firstname")
                    .species("planet c8jh")
                    .id("user"+i)
                    .pwd("1111")
                    .build();

            memberRepository.save(member);
        });
    }
}
