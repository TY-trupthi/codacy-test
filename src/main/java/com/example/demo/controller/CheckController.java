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
	
	private Integer value;
	private String Name = "Trupthi";
	private String lastName;
	
	@GetMapping("/{value}")
	public ResponseEntity<String> getData(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world " + Name + lastName.toLowerCase() + value, HttpStatus.OK);
	}
	
	@GetMapping("1/{value}")
	public ResponseEntity<String> getData1(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world" + value, HttpStatus.OK);
	}
	
	@GetMapping("2/{value}")
	public ResponseEntity<String> getData2(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world" + value, HttpStatus.OK);
	}
	
	@GetMapping("4/{value}")
	public ResponseEntity<String> getData4(@PathVariable Integer value){
		return new ResponseEntity<String>("hello world" + value, HttpStatus.OK);
	}

}
