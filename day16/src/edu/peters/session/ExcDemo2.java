package edu.peters.session;

public class ExcDemo2 {

	public static void main(String[] args) {
	
		
		int[] num = {10,20,30};
		
		for(int i=0;i<3;i++) {
			System.out.println(num[i]);
		}
		try {
			System.out.println(num[10]);
				
		}catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		System.out.println("StPeters College");
		System.out.println("Java");
		
	}

}