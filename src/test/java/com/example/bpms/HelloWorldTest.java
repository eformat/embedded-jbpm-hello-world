package com.example.bpms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.bpms.HelloWorld;


public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello, mike", helloWorld.sayHello("mike"));
	}

}
