package com.redis.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redis.entities.User;
import com.redis.repositories.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserRepo repo;

	public UserController(UserRepo repo) {
		this.repo = repo;
	}

	@PostMapping
	public User SaveUser(@RequestBody User user) {
		return repo.save(user);
	}

	@GetMapping("/{userId}")
	public User getUserById(@PathVariable("userId") String userId) {

		return repo.findById(userId).orElse(null);
	}

	@GetMapping
	public List<User> getAllUsers() {
		return (List<User>) repo.findAll();
	}

	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable("userId") String userId, @RequestBody User user) {

		user.setUserId(userId);

		User updatedUser = repo.save(user);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(updatedUser);

	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("userId") String userId) {

		repo.deleteById(userId);

		return ResponseEntity.ok("Deleted..");
	}
}
