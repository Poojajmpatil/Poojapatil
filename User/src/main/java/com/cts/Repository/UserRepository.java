package com.cts.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
