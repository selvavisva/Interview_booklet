package com.depth.functionalinterface;

@FunctionalInterface
public interface Transformer<T,R> {	
	R transform(T input);
}
