package edu.stpeters;

public class HelloPrinter {
	    public static void main(String[] args) {
	        int n = 9; // The starting number, corresponding to the length of the sequence
	        for (int i = n; i >= 1; i--) { // Loop from n down to 1
	            for (int j = i; j >= 1; j--) { // Print numbers from i down to 1
	                System.out.print(j); // Print the number without newline
	            }
	            System.out.println(); // Move to the next line after each iteration
	        }
	    }
	}

