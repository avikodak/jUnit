package com.avikodak.junit.impl;

import org.junit.Before;
import org.junit.Test;

import com.avikodak.junit.Greeting;

import junit.framework.Assert;

public class GreetingImplTest {

	private Greeting greeting;

	@Before
	public void setup() {
		greeting = new GreetingImpl();

	}

	@Test
	public void greetShouldReturnAValidOutput() {
		String result = greeting.greet("JUnit");
		Assert.assertNotNull(result);
		Assert.assertEquals("Hello JUnit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameIsNull() {
		greeting.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameIsEmpty() {
		greeting.greet("");
	}
}
