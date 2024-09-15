package com.seminar.example.service;

import com.seminar.example.domain.Member;
import com.seminar.example.dto.request.MemberDto;
import com.seminar.example.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public List<com.seminar.example.dto.response.MemberDto> getMembers() {
        return memberRepository.findAll().stream()
                .map(com.seminar.example.dto.response.MemberDto::fromEntity)
                .toList();

    }

    public void createMember(MemberDto memberDto) {
        memberRepository.save(
                Member.builder()
                        .name(memberDto.name())
                        .mbti(memberDto.mbti())
                        .github(memberDto.github())
                        .velog(memberDto.velog())
                        .role(memberDto.role())
                        .build()
        );
    }
}
