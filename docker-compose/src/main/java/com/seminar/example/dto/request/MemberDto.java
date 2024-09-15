package com.seminar.example.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MemberDto(
        @JsonProperty(value = "name")
        String name,
        @JsonProperty(value = "mbti")
        String mbti,
        @JsonProperty(value = "github")
        String github,
        @JsonProperty(value = "velog")
        String velog,
        @JsonProperty(value = "role")
        String role
) {
}
