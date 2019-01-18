package com.freshvotes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.freshvotes.domain.User;
import com.freshvotes.repositories.UserRepository;
import com.freshvotes.security.CustomSecurityUser;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user=userRepo.findByUsername(username);
		
		if(user==null)
			throw new UsernameNotFoundException("Invalid username or password");
		
		return new CustomSecurityUser(user);
	}

}
