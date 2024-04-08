package com.board.one;

import com.board.one.domain.Member;
import com.board.one.ripository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void 저장() {
        Member saveParam = Member.builder()
                .loginId("gg1651")
                .password("1234")
                .name("밥오")
                .email("tkwk@naver.com")
                .deleteYn(false)
                .build();

        Member member = memberRepository.save(saveParam);
    }
}
