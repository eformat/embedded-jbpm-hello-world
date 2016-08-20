package com.michaelrice.ebpm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello, nico", helloWorld.sayHello("nico"));
	}

}
