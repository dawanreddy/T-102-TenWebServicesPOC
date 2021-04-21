package com.manodavidson.solutions.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manodavidson.solutions.model.User;
import com.manodavidson.solutions.repository.UserRepository;

@RestController
public class ConversationHandlerController {
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/conversation/{username:[A-M][a-z]+}", consumes = MediaType.ALL_VALUE, produces = {
			"application/json" })
	public String returnUserDetailsJSON(@PathVariable("username") String name) {
		User user = userRepository.findByUserName(name);
		System.out.println(user);
		if (Objects.isNull(user)) {
			return "{Kindly enter a valid UserName}";
		} else {
			return user.toString();
		}
	}

	@RequestMapping(value = "/conversation/{username:[N-Z][a-z]+}", consumes = MediaType.ALL_VALUE, produces = {
			"application/xml" })
	public Object returnUserDetailsXML(@PathVariable("username") String name) {
		User user = userRepository.findByUserName(name);
		System.out.println(user);
		if (Objects.isNull(user)) {
			return "{Kindly enter a valid UserName}";
		} else {
			return user;
		}
	}

	// Must be last method always
	@RequestMapping(value = "**", method = { RequestMethod.GET, RequestMethod.POST })
	public String getAnythingelse() {
		return "Kindly enter a valid request, For eg: Enter your username";
	}
}
