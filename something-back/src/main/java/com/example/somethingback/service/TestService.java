package com.example.somethingback.service;

import com.example.somethingback.domain.TestDomain;
import com.example.somethingback.domain.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public TestDomain findById(Long id){
        return repository.findById(id).get();
    }

    public List<TestDomain> findAll() {
        return repository.findAll();
    }

}
