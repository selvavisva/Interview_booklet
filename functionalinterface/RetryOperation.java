package com.depth.functionalinterface;

@FunctionalInterface
public interface RetryOperation<T> {
	T execute();
}
