package com.example.ex06.controller;

import com.example.ex06.entiy.Member;
import com.example.ex06.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
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

    //insert
    @PostMapping
    public Member createMember(
            @RequestBody Member member) {

        return memberService.createMember(member);
    }

    //update
    @PutMapping("{id}")
    public Member update(
            @PathVariable Long id,
            @RequestBody Member member) throws Exception {
        return memberService.update(id,member);
    }
    @DeleteMapping("{id}")
    @Operation(summary = "회원을 삭제합니다.",description = "삭제하고 싶은 id을 입력하세요")
    public boolean deleteMember(@PathVariable Long id) throws Exception {
        boolean result = memberService.deleteMember(id);
        return result;
    }
}
