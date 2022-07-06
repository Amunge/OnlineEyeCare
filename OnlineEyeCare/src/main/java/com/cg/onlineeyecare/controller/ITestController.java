package com.cg.onlineeyecare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineeyecare.dto.TestModule;
import com.cg.onlineeyecare.exceptions.TestIdNotFoundException;
import com.cg.onlineeyecare.service.ITestService;

//@Api
@RestController
@RequestMapping("/v1")
public class ITestController {
	
	
	@Autowired
	public ITestService tservice;
	
	
	@GetMapping("/alltests")
	public List<TestModule> viewAllTest(){
		return tservice.viewAllTests();
	}
	
	
	@PostMapping("/test/add")
	public TestModule add(@RequestBody TestModule test) {
		return tservice.addTest(test);
	}
	
	
	@DeleteMapping("/test/remove/{testId}")
	public TestModule removeTest(@PathVariable int testId)throws TestIdNotFoundException {
		return tservice.removeTest(testId);
		
	}
	
	@PutMapping()
	public TestModule updateTest(@RequestBody TestModule Test) {
		return tservice.updateTest(Test);
		
	}
	
	
	@GetMapping("/test/viewtest/{testid}")
	private TestModule viewTest(@PathVariable("testid") int testid)throws TestIdNotFoundException {
		return tservice.viewTest(testid);
	}

}
