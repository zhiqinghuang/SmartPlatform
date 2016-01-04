package com.mossle.auth.support;

public class CheckUserStatusException extends RuntimeException {
	private static final long serialVersionUID = 1968985172595071076L;

	public CheckUserStatusException(String message) {
		super(message);
	}
}