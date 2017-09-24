package com.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CopyOfJenkinsController2 {
	@RequestMapping("/test2")
	public String test(){
		return "success";	
	}
}
