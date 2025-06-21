package Conditional_Statement;
import java.util.Scanner;

public class checkPrime {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primeBetweenN(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();
        System.out.println("Prime numbers between " + n + " and " + m + " are:");
        primeBetweenN(n, m);
    }
}

