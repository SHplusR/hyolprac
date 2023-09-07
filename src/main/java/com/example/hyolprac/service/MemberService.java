package com.example.hyolprac.service;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.entity.Member;

public interface MemberService {

    default Member dtoToEntity(MemberDTO dto){
        Member member = Member.builder()
                .id(dto.getId())
                .pwd(dto.getPwd())
                .build();
        return member;
    }
    boolean login(MemberDTO dto);
}
