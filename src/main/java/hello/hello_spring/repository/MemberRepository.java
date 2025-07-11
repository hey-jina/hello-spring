package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);                 // 회원 저장(등록)
    Optional<Member> findById(Long id);         // id 로 회원 조회
    Optional<Member> findByName(String name);   // name 으로 회원 조회
    List<Member> findAll();                     // 모든 회원 조회
}
