package com.seminar.example.controller;

import com.seminar.example.dto.global.ResponseDto;
import com.seminar.example.dto.request.MemberDto;
import com.seminar.example.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/api/v1/members")
    public ResponseDto<?> getMembers() {
        return ResponseDto.ok(memberService.getMembers());
    }

    @PostMapping("/api/v1/members")
    public ResponseDto<?> createMember(@RequestBody MemberDto memberDto) {
        memberService.createMember(memberDto);
        return ResponseDto.created(null);
    }
}
