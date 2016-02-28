package com.avikodak.junit.impl;

import com.avikodak.junit.Greeting;

public class GreetingImpl implements Greeting {

	public String greet(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
