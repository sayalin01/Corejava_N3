package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class JunitAnnotation {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit Test case");
	}
	
	@Test
	@BeforeAll
	static void display() {
		System.out.println("Welcome to Junit5 teting");
	}
	@Test
	@AfterEach
	@Disabled
	void accept() {
		System.out.println("After each method");
	}
	
	@Test
	@AfterAll
	static void run() {
		System.out.println("AfterAll method");
		
	}
	@Test
	@BeforeEach
	void Execute() {
		System.out.println("Before Each method");
		
	}
	
}
	
	


