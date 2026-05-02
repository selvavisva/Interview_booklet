package com.depth.exception;

//Exception which is not recoverable by user extends Runtime Exception
public class NoMarketDataAvailableException extends RuntimeException{
	public NoMarketDataAvailableException(String message) {
		super(message);
	}
}
