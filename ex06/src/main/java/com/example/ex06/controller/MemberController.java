package com.example.ex06.controller;

import com.example.ex06.entiy.Member;
import com.example.ex06.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("members")
@RequiredArgsConstructor
@CrossOrigin
public class MemberController {
    //autowird
    private final MemberService memberService;

//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }

    @GetMapping
    public List<Member> findAll() {
        return memberService.findAll();
    }
    @GetMapping("/{id}")
    public Member findById(@PathVariable Long id) {
        Member member = memberService.findById(id);
        return member;
    }
}
