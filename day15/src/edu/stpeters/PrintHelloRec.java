package edu.stpeters;

public class PrintHelloRec {

	public static void main(String[] args) {
      
		
		int n = 5;
		printHello(n);
	}

	private static void printHello(int n) {
		// TODO Auto-generated method stub
		if(n !=0) {
			System.out.println("hello");
			printHello(n-1);
		}
	}

}
