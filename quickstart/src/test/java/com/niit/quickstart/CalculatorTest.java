package com.niit.quickstart;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		assertEquals(calculator.add(2,3),5);
	}

}
