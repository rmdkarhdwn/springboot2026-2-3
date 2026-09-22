package com.example.ex06.service;

import com.example.ex06.entiy.Member;
import com.example.ex06.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
    public Member findById(long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @Transactional
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member update(Long id, Member member) throws Exception{
        Optional<Member> optionalMember = memberRepository.findById(id);
        if (optionalMember.isPresent()) {
            memberRepository.save(member);
        } else {
            throw new Exception("수정할 내용이 없습니다.");
        }
        return member;
    }

    public boolean deleteMember(Long id) throws Exception{
        Member member = memberRepository
                .findById(id)
                .orElseThrow(() -> new Exception("해당하는 id"+id+"가 없어서 삭제할 내용이 없습니다."));
        memberRepository.delete(member);
        return true;
    }
}
