package com.example.somethingback.domain;

import com.example.somethingback.domain.TestDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestDomain, Long> {
}
