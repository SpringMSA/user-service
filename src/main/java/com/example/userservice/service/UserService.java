package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;

public interface UserService {
	UserDto createUser(UserDto userDetails);
	UserDto getUserByUserId(String userId);
	Iterable<UserEntity> getUserByAll();
}
