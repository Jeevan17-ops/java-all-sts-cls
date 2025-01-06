package edu.stpeters;

public class REv2 {

	public static void main(String[] args) {
		 int n = 5;
	        System.out.println("Factorial of " + n + " is ----> " + factorial(n));

	        int p= 1;
	        for (int i = 1; i <= n; i++) {
	            p*= i;
	        }
	        System.out.println("Recursion numbers from 1 to " + n + "--->" + p);
	    }

	    private static int factorial(int n) {
	        return n > 1 ? n * factorial(n - 1) : 1;
	    }
	
	}


