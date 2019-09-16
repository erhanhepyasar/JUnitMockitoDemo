package com.demo.demojunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCalculator  {
	
	Calculator calc = null;
	CalculatorService service = mock(CalculatorService.class);
	
	@Before
	public void setup() {
		
		calc = new Calculator(service);
	}
	
	// JUnit
	@Test
	public void testAdd() {
		
		assertEquals(5, calc.add(2, 3));
		
	}
	
	// Mockito
	@Test
	public void testCalculate() {
		
		when(service.multiply(2, 3)).thenReturn(6);
		assertEquals(8, calc.calculate(2, 3));
		verify(service).multiply(2, 3);
		
	}

}
