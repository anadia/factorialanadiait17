package org.anadiait.factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	private Factorial factorial;

	@Before
	public void init() {
		factorial = new Factorial();
	}

	@Test
	public void shouldFactorialOfZeroReturnOne() {
		long result = factorial.compute(0);
		long expectedValue = 1;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialOfOneReturnOne() {

		long result = factorial.compute(1);
		long expectedValue = 1;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialOfTwoReturnTwo() {

		long result = factorial.compute(2);
		long expectedValue = 2;

		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactorialOfThreeReturnSix() {

		long result = factorial.compute(3);
		long expectedValue = 6;

		assertEquals(expectedValue, result);
	}

}
