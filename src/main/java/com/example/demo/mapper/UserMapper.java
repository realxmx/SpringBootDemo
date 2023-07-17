package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.User;

public interface UserMapper {

	List<User> get();

	void insert(User user);

	void update(User user);

	void delete(Long id);

}