package com.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {

	@GetMapping("/jenkins")
	public String testJenkins() {
		return "Jenkins with Docker";
	}

	@PostMapping("/save")
	public String postData(@RequestBody String text) {
		return "Saved data:" + text;
	}
}
