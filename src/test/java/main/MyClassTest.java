package main;


import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.Assume;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.MyClass;

public class MyClassTest {
  
  @Test(expected = IllegalArgumentException.class)
  public void testExceptionIsThrown() {
    MyClass tester = new MyClass();
    tester.multiply(1000, 5);
  }

  @Test
  public void testMultiply() {
	//Assume.assumeFalse(System.getProperty("os.name").contains("Mac OS X"));
    MyClass tester = new MyClass();
    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
  }
  
  
  @Test
  public void multiplicationOfZeroIntegersShouldReturnZero() {
      MyClass tester = new MyClass(); // MyClass is tested

      // assert statements
      assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
      assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
      assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
      
  }
  
  @ParameterizedTest
  @ValueSource(strings = { "Hello", "JUnit" })
  void withValueSource(String word) {
  	assertNotNull(word);
  }
  
  @ParameterizedTest
  @ValueSource(strings = { "pippip", "radar", "able was I ere I saw elba" })
  void palindromes(String candidate) {
	  MyClass tester = new MyClass();
      assertTrue(tester.isPalindrome(candidate));
  }
  
 
  
  @Test // Multi-line script, custom engine name and custom reason.
  @EnabledIf(value = {
    "load('nashorn:mozilla_compat.js')",
    "importPackage(java.time)",
    "",
    "var today = LocalDate.now()",
    "var tomorrow = today.plusDays(1)",	
    "tomorrow.isAfter(today)"
    },
    engine = "nashorn",
    reason = "Self-fulfilling: {result}")
  public void theDayAfterTomorrow() {
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = today.plusDays(1);
    assertTrue(tomorrow.isAfter(today));
  }
  
  @ParameterizedTest
  @Disabled
  @ValueSource(ints = {1,2,3,-1})
  void test(int i) {
	  assumeTrue(i >=0);
	  // assumeTrue(i >=0, "Wrong Input, Only positive ints please");
  	try {
  		Thread.sleep(i);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
  }
  
  
}
