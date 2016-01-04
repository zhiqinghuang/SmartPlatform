package com.mossle.auth.support;

public class CheckRoleException extends RuntimeException {
	private static final long serialVersionUID = 2866137937565656476L;

	public CheckRoleException(String message) {
		super(message);
	}
}