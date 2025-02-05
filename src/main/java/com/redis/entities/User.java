package com.redis.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@RedisHash(value = "user")
public class User {

	@Id
	@Indexed // TO improve performance while fetching
	private String userId;
	private String name;
	private String email;
}
