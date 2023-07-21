package com.example.hyolprac.service;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.entity.Member;

public interface SignupService  {

    default Member dtoToEntity(MemberDTO dto){
//        Member member = Member.builder().email(dto.getWriterEmail()).build();
        Member member = Member.builder().mno(dto.getMno()).build();
        return member;
    }
}
