package com.example.hyolprac.service;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.entity.Member;

public interface SignupService  {

    default Member dtoToEntity(MemberDTO dto){
       Member member = Member.builder()
               .mno(dto.getMno())
               .lastname(dto.getLastname())
               .firstname(dto.getFirstname())
               .species(dto.getSpecies())
               .id(dto.getId())
               .pwd(dto.getPwd())
               .birth(dto.getBirth())
               .build();
       return member;
    }

    void signup(MemberDTO dto);
}
