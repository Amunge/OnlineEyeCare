package com.cg.onlineeyecare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineeyecare.dto.TestModule;

public interface ITestRepository extends JpaRepository<TestModule, Integer> {

}
