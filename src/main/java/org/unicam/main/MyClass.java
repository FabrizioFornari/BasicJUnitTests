package org.unicam.main;

public class MyClass {

	public static int multiply(int x, int y) {

		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
	
	public boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
