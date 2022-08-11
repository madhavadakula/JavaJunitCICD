package com.asw.docker.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyJavaCICDTest {

	@Test
	void testAdd() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(10, a.add(5, 5));
	}

	@Test
	void testAdd1() {
		MyJavaCICD a = new MyJavaCICD();
		assertEquals(9, a.add(5, 5));
	}
}
