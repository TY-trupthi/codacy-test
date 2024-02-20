package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class CheckController {
	
	@GetMapping("/{value}")
	public ResponseEntity<String> getData(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world", HttpStatus.OK);
	}
	
	@GetMapping("1/{value}")
	public ResponseEntity<String> getData1(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world", HttpStatus.OK);
	}
	
	@GetMapping("2/{value}")
	public ResponseEntity<String> getData2(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world", HttpStatus.OK);
	}

}
