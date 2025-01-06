package day13;

import java.util.Scanner;

public class Accumulate {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = Scanner.nextInt();
        
        while (number >= 10) {
            int sum = 0;
            
            while (number > 0) {
                sum += number % 10;  
                number /= 10;  
            }
            number = sum;  
        }
        System.out.println("The result is: " + number);
    }
}
