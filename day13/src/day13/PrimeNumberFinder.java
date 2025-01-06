package day13;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        int range = 300, primeCount = 0, prime = 0;
        
        for (int num = 2; num <= range; num++) {
            if (isPrime(num) == 1 && ++primeCount == 17) {
                prime = num;
                break;
            }
        }
        System.out.println("The 17th prime number in the range from 1 to " + range + " is: " + prime);
    }
    public static int isPrime(int num) {
        for (int i = 2;
        		i + i <= num; i++) if (num % i == 0) return 0;
        return num > 1 ?1 : 0;
    }
}
