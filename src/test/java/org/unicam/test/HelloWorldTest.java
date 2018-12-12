package org.unicam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

import org.unicam.main.HelloWorld;

public class HelloWorldTest {

	private HelloWorld hW;
	private String inputNumber;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		hW = new HelloWorld();
	}

	@AfterEach
	void tearDown() throws Exception {
		hW = null;
	}

	@Test
	void testHelloShouldReturnAString() {
		assertNotNull(HelloWorld.hello());
	}
	
	@Test
	@Tag("display")
	@DisplayName("Custom test name containing spaces")
	void testWithDisplayNameContainingSpaces() {
	}

	@Test
	@Tag("display")
	@DisplayName(" °□°） ")
	void testWithDisplayNameContainingSpecialCharacters() {
	}

	@Test
	@Tag("display")
	@DisplayName("😈")
	void testWithDisplayNameContainingEmoji() {
	}

	@Test
	@DisplayName("Custom testNumber")
	void testNumber() {
		inputNumber = hW.printNumber(3);
		assertEquals(inputNumber, "n: " + 3);
	}

	@DisplayName("Custom testNumberFizz")
	@Test
	void testNumberFizz() {
		inputNumber = hW.printNumber(3);
		assertNotEquals(inputNumber, "Fizz");
	}

	@Test
	@Disabled
	void testName() throws Exception {

	}

	@Test
	@DisplayName("😈")
	@Disabled
	void testMain() {
		fail("Not yet implemented");
	}
	
	@Test
	  @EnabledOnOs(MAC)
	  void onlyOnMacOs() {
		  HelloWorld tester = new HelloWorld();
		  tester.getOS().equals("Mac OS X");
	  }

	@Test
	  @EnabledOnOs(WINDOWS)
	  void onlyOnWindowsOs() {
		  HelloWorld tester = new HelloWorld();
		  tester.getOS().contains("Windows");
	  }
	
	@Test
	  @EnabledOnOs(LINUX)
	  void onlyOnLinuxOs() {
		  HelloWorld tester = new HelloWorld();
		  tester.getOS().contains("Linux");
	  }
	

	@Test
	@Tag("taxes")
	void testingTaxCalculation() {
	}
	
}
