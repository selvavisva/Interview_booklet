package com.depth.exception;

//Custom checked exception extends Exception. The exception
//which can be recoverable.
public class NoAvailableBalanceException extends Exception{
	
	public NoAvailableBalanceException(String message) {
		super(message);
	}
}