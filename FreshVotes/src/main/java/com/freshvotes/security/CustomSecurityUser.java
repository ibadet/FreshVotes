package com.freshvotes.security;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.freshvotes.domain.User;

public class CustomSecurityUser extends User implements UserDetails {

	
	private static final long serialVersionUID = 1L;
	
	Set<Authority> authorities=new HashSet<>();

	public CustomSecurityUser() {
	}
	
	public CustomSecurityUser(User user) {
		this.setId(user.getId());
		this.setName(user.getName());
		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		this.setAuthorities(user.getAuthorities());
	}

	@Override
	public Set<Authority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}
