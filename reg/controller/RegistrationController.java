package com.cts.reg.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.reg.model.Registration;

import com.cts.reg.service.RegistrationService;
@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	RegistrationService service;

	@RequestMapping("/registrations")
	List<Registration> getAllRegistrations() {
		return service.getAllRegistrations(); 
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/registrations")
	void addRegistration(@RequestBody Registration registration) {
		service.addRegistration(registration);
	}
	
	@RequestMapping("/registration/{id}")
	Optional<Registration> getRegistrationDetailsByID(@PathVariable int id) {
		return service.getRegistrationDetailsByID(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/registrations/")
	void updateRegistration(@RequestBody Registration registration) {
		service.updateRegistration(registration);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/registrations/{id}")
	void deleteRegistration(@PathVariable int id) {
		service.deleteRegistration(id);
	}
	
	
	
}