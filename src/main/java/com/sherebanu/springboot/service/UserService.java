package com.sherebanu.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sherebanu.springboot.model.User;
import com.sherebanu.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	BCryptPasswordEncoder getpassEncoder();
}