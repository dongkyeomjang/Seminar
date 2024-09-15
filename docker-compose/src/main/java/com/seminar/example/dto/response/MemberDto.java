package com.seminar.example.dto.response;

import com.seminar.example.domain.Member;
import lombok.Builder;

@Builder
public record MemberDto(
        String name,
        String mbti,
        String github,
        String velog,
        String role
) {
    public static MemberDto fromEntity(Member member) {
        return MemberDto.builder()
                .name(member.getName())
                .mbti(member.getMbti())
                .github(member.getGithub())
                .velog(member.getVelog())
                .role(member.getRole())
                .build();
    }
}
