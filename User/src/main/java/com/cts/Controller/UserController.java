package com.cts.Controller;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Model.User;
import com.cts.Service.UserService;


@RestController
@Validated
public class UserController {
 
	@Autowired
	UserService userService;
//	
	@GetMapping("/users")
	public List<User> getUser(){
		return userService.getAllUser();
	}
//	
//	@GetMapping("/users")
//	public List<String> getUser(){
//	return Stream.of("abc","bcd").collect(Collectors.toList());
//	}	
	
	
	
	@PostMapping("/user")
	public void insertStudent(@Valid @RequestBody User user) {
		userService.saveUser(user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public HttpStatus updateUser(@RequestBody User user) {
		return userService.updateUser(user)  ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	
}
