package main;

public class MyClass {

	public int multiply(int x, int y) {
		// the following is just an example
		//if(x==0) return 1;
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
	
	public boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
}
