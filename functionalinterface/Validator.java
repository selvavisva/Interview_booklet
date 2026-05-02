package com.depth.functionalinterface;

@FunctionalInterface
public interface Validator<T> {
	boolean validate(T input);
}
