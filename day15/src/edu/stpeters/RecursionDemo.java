package edu.stpeters;

public class RecursionDemo {

	public static void main(String[] args) {
int n =32;
int res = factorial(n);
System.out.println(res);

	}

	private static int factorial(int n) {
		return n >1?n* factorial(n-1):1;
	}

}
