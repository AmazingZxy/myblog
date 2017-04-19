package com.zxy.exceptions;

@SuppressWarnings("serial")
public class PasswordIsError extends UserException {

	public PasswordIsError(String message){
		super(message);
	}
}
