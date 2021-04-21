package com.manodavidson.solutions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manodavidson.solutions.repository.UserRepository;

@RestController
public class RootController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public String defaultConversationController() {
		return "Kindly enter a User-Name to proceed!";
	}
}
