package com.board.one.ripository;

import com.board.one.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Member, Long> {

}

