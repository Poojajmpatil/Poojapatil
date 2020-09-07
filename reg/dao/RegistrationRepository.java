package com.cts.reg.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.reg.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	 Optional<Registration> findById(int id);

	}

