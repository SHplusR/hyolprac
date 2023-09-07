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
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Override
    public boolean login(MemberDTO dto) {
        log.info("dto = "+dto);
        Member member = dtoToEntity(dto);
        Optional<Member> byuserid = memberRepository.findById(member.getId());
        if(byuserid.isPresent()){
            if(!byuserid.get().getPwd().equals(member.getPwd())){
                //비번이 다른 경우
                log.info("user = "+ byuserid.get().getId() + " "+byuserid.get().getPwd());
                log.info("member = "+ member.getId() + " "+member.getPwd());
                return false;
            }
            else{
                //비번 같은 경우
                log.info("user = "+ byuserid.get().getId() + " "+byuserid.get().getPwd());
                log.info("member = "+ member.getId() + " "+member.getPwd());
                return true;
            }
        }
        //아예 아이디가 없는 경우
        return false;
    };
}
