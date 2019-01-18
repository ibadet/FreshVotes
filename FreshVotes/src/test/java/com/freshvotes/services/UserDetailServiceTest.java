package com.freshvotes.services;


import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class UserDetailServiceTest {

	@Test
	public void generate_encrypted_password() {
		//fail("Not yet implemented");
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String rawPassword="password123";
		String encodedPassword=encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		assertThat(rawPassword,not(encodedPassword));
	}

}
