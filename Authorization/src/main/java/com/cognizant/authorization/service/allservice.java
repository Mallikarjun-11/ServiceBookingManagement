package com.cognizant.authorization.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cognizant.authorization.exception.UserNotFoundException;
import com.cognizant.authorization.model.AppUser;
import com.cognizant.authorization.model.MyUser;
import com.cognizant.authorization.repository.AllUserRepository;
import com.cognizant.authorization.repository.MyUserRepository;

@Service
public class allservice implements UserDetailsService {
	@Autowired
	private AllUserRepository userdao;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		AppUser custuser = userdao.findByName(name);
		return new User(custuser.getName(), custuser.getPassword(), new ArrayList<>());

	}

	public UserDetails loadUserByName(String name) {
		AppUser custuser = userdao.findByName(name);
		return new User(custuser.getName(), custuser.getPassword(), new ArrayList<>());

	}
}
