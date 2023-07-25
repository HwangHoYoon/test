package com.jagiya.main.service;

import com.jagiya.main.entity.TestRes;
import com.jagiya.main.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    public TestRes findById(Long id) {
        return new TestRes(testRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no such data")));
    }

}
