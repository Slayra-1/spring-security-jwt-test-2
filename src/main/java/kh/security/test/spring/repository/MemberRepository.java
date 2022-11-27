package kh.security.test.spring.repository;

import kh.security.test.spring.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Slayra
 * @date 2022-11-27
 **/
public interface MemberRepository extends JpaRepository<Member, String> {
}
