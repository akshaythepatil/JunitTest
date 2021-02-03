package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mu;
	
	
	@BeforeEach
	void init()
	{
		 mu= new MathUtils();
		
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleanup");
	}
	@Test
	void test() {
		
				int expected=5;
				int actual =mu.add(3, 2);
				assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("Area of Rectangle")
	void testRectangle()
	{
		int expected=25;
		int actual =mu.recArea(5, 5);
		assertEquals(expected,actual);
	}
	@Test
	@Disabled
	void failTest()
	{
		fail("this failed");
	}
}
