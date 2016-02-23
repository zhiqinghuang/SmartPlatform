package com.mossle.security.util;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.mossle.api.tenant.TenantHolder;
import com.mossle.security.SecurityConstants;

public class RememberLastUsernameAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	@Resource
	private TenantHolder tenantHolder;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
		String tenantCode = tenantHolder.getTenantCode();
		String username = this.getUsername(authentication);
		this.addCookie(response, SecurityConstants.SECURITY_LAST_USERNAME, username);
		this.addCookie(response, SecurityConstants.SECURITY_LAST_TENANT, tenantCode);
		super.onAuthenticationSuccess(request, response, authentication);
	}

	public void addCookie(HttpServletResponse response, String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(3600 * 24 * 30);
		response.addCookie(cookie);
	}

	public String getUsername(Authentication authentication) {
		if (authentication == null) {
			return "";
		}
		return SpringSecurityUtils.getUser(authentication);
	}
}