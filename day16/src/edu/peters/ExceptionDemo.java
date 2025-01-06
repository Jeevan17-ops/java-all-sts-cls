package edu.peters;

public class ExceptionDemo {

	public static void main(String[] args) {
     
int n= 100,d=2;
		
		try{
			
			System.out.println(n/d);
			
				
		}catch(Exception a) {
			System.out.println("error occurred...");
			a.printStackTrace();
			try {
				System.out.println("Nested try block.....");
				System.out.println(10/0);
					
			}catch(Exception e1) {
				System.out.println("inside error....");
				e1.printStackTrace();
			}
		}
		
		System.out.println("welcome");
		System.out.println("hello");
		System.out.println("HYD");
	
	
	}
	}

