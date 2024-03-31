package org.example.firstproject.repository;

import org.example.firstproject.entity.Article;
import org.example.firstproject.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
