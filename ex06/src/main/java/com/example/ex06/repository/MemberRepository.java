package com.example.ex06.repository;

import com.example.ex06.entiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
