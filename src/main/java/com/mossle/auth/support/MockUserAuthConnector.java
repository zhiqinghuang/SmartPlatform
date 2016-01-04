package com.mossle.auth.support;

import java.util.Collections;

import com.mossle.api.userauth.UserAuthConnector;
import com.mossle.api.userauth.UserAuthDTO;

public class MockUserAuthConnector implements UserAuthConnector {
	private UserAuthDTO userAuthDto;

	public MockUserAuthConnector() {
		userAuthDto = new UserAuthDTO();
		userAuthDto.setId("1");
		userAuthDto.setTenantId("1");
		userAuthDto.setUsername("lingo");
		userAuthDto.setRef("1");
		userAuthDto.setDisplayName("lingo");
		userAuthDto.setStatus("1");
		userAuthDto.setPermissions(Collections.singletonList("*"));
		userAuthDto.setRoles(Collections.singletonList("ROLE_ADMIN"));
	}

	public UserAuthDTO findByUsername(String username, String tenantId) {
		return userAuthDto;
	}

	public UserAuthDTO findByRef(String ref, String tenantId) {
		return userAuthDto;
	}

	public UserAuthDTO findById(String id, String tenantId) {
		return userAuthDto;
	}
}