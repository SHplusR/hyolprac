package com.example.hyolprac.service;

import com.example.hyolprac.dto.MemberDTO;
import com.example.hyolprac.entity.Member;
import com.example.hyolprac.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService{
    private final MemberRepository memberRepository;
    @Override
    public void signup(MemberDTO dto) {
        log.info(dto);
        Member member = dtoToEntity(dto);
        memberRepository.save(member);
    }

    @Override
    public String idCheck(String id) {
        Optional<Member> bymemid = memberRepository.findById(id);
        System.out.println("optinal bymemid = "+ bymemid);
        if(bymemid.isPresent()){
            //존재한다 그러니까 안된다!
            return null;
        }
        else{
            return "ok";
        }
    }
}
