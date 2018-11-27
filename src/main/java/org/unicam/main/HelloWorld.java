package org.unicam.main;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(System.getProperty("os.name"));

	}

	public String printNumber(int n) {
		System.out.println("n: "+n);
		return("n: "+n);
		
	}
	
	public String getOS() {
		return System.getProperty("os.name");
	}
	
}
