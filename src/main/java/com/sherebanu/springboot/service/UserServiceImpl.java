package com.sherebanu.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sherebanu.springboot.model.User;
import com.sherebanu.springboot.repository.UserRepository;
import com.sherebanu.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.repo = userRepository;
	}
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User save(UserRegistrationDto dto) {
		User user = new User(dto.getName(), 
				dto.getAddress(), 
				dto.getEmail(), 
				dto.getDob(), 
				dto.getUsername(), 
				passEncoder.encode(dto.getPassword())); 
		return repo.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user = repo.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		List<GrantedAuthority> authorities = new ArrayList<>();
	    authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

	    return new org.springframework.security.core.userdetails.User(
	            user.getUsername(),
	            user.getPassword(),
	            authorities);		
	}
	
	@Override
	public BCryptPasswordEncoder getpassEncoder() {
		return passEncoder;
	}
	
	
	
}