package com.depth.functionalinterface;

@FunctionalInterface
public interface Logger<T> {
	void log(T input);
}