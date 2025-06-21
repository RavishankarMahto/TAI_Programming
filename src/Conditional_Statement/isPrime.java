package Conditional_Statement;

import java.util.Scanner;

public class isPrime {
    public static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Print the result
        if (checkPrime(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

