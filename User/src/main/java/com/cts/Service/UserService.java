package com.cts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Model.User;
import com.cts.Repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser(){
		return (List<User>) userRepository.findAll();
	}
	public void saveUser(User user) {
		userRepository.save(user);
	}
	public boolean updateUser(User user) {
		return userRepository.save(user) != null;
	
}
}
