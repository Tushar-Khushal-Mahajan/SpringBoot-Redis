package com.redis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.redis.entities.User;

public interface UserRepo extends CrudRepository<User, String> {

}
