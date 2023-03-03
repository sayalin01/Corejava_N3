package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgramTesting {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit Test case");
	}
	
	@Test
	void display() {
		System.out.println("Welcome to Junit test unit");
	}

}
