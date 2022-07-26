package com.cognizant.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.authorization.model.AppUser;

public interface AllUserRepository extends JpaRepository<AppUser, Integer> {

	AppUser findByName(String username);

	//AppUser findByName(String name);

}
