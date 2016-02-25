package com.mossle.security.util;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.mossle.core.auth.CustomPasswordEncoder;

public class SimplePasswordEncoder implements CustomPasswordEncoder {
	private PasswordEncoder passwordEncoder;

	public SimplePasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public String encode(CharSequence rawPassword) {
		return passwordEncoder.encode(rawPassword);
	}

	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return passwordEncoder.matches(rawPassword, encodedPassword);
	}
}

//need to confirm