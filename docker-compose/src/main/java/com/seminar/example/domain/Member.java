package com.seminar.example.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "mbti")
    String mbti;

    @Column(name = "github")
    String github;

    @Column(name = "velog")
    String velog;

    @Column(name = "role")
    String role;

    @Builder
    public Member(String name, String mbti, String github, String velog, String role) {
        this.name = name;
        this.mbti = mbti;
        this.github = github;
        this.velog = velog;
        this.role = role;
    }
}
