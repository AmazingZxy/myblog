package com.zxy.exceptions;

@SuppressWarnings("serial")
public class SQLStatementIsErrorException extends Exception {

	public SQLStatementIsErrorException(String message){
		super(message);
	}
}
