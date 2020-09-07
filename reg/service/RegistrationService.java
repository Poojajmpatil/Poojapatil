package com.cts.reg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.reg.dao.RegistrationRepository;

import com.cts.reg.model.Registration;

@Service
public class RegistrationService {


	@Autowired
	RegistrationRepository repo;

	public List<Registration> getAllRegistrations() {
		

		return (List<Registration>)repo.findAll();
		
	}

	public void addRegistration(Registration registration) {
		repo.save(registration);
		
	}

	

	public void updateRegistration(Registration registration) {
		repo.save(registration);
		
	}

	public void deleteRegistration(int id) {
		repo.deleteById(id);
		
	}



	public Optional<Registration> getRegistrationById(int id) {
		
		return repo.findById(id);
		
	}

	public Optional<Registration> getRegistrationDetailsByID(int id) {
		return repo.findById(id);
	}

	

}