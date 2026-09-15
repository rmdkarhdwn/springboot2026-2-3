package com.example.ex06.service;

import com.example.ex06.entiy.Member;
import com.example.ex06.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
