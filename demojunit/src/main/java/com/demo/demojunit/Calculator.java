package com.demo.demojunit;

public class Calculator {
	
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	// JUnit
	public int add(int a, int b) {
		return a + b;
	}
	
	// Mockito
	public int calculate(int a, int b) {
		return service.multiply(a, b) + a;
	}

}
