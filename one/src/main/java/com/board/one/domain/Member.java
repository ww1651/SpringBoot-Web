package com.board.one.domain;


import com.board.one.config.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Member extends BaseTimeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;             // 회원 번호 (PK)

    private String userid;      // 로그인 ID

    private String password;     // 비밀번호

    private String nickname;         // 이름

    private String email;         // 이름

    private Boolean deleteYn;    // 삭제 여부

    @Builder
    public Member(String loginId, String password, String name, String email , Boolean deleteYn) {
        this.userid = userid;
        this.password = password;
        this.nickname = name;
        this.deleteYn = deleteYn;
        this.email = email;
    }

}
