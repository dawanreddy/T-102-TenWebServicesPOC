package com.manodavidson.solutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manodavidson.solutions.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUserName(String userName);
}
