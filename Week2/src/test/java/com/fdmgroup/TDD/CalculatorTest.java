package com.fdmgroup.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void test_AddMethodReturns5When2And3IsPassed() {
		//Arrange
		Calculator calculator = new Calculator();
		//Act
		int result = calculator.add(2, 3);
		//Assert
		assertEquals(5, result);
	}
	
	@Test
	public void test_AddMethodReturns10When5And5IsPassed() {
		//Arrange
		Calculator calculator = new Calculator();
		//Act
		int result = calculator.add(5, 5);
		//Assert
		assertEquals(10, result);
	}
	
	@Test
	public void test_MultiplyMethodReturns10When5And2IsPassed() {
		//Arrange
		Calculator calculator = new Calculator();
		//Act
		int result = calculator.multiply(5, 2);
		//Assert
		assertEquals(10, result);
	}
}
