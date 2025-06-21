package Looping;

import java.util.Scanner;

public class countFactors {
    public static void countFactors(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        System.out.println("Number of factors of " + n + " is: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        countFactors(n);
        sc.close();
    }
}

//public class countFactors {
//    public static int getFactorCount(int n) {
//        int count = 0;
//        for(int i = 1; i <= n; i++) {
//            if(n % i == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void printFactorsUpToN(int n) {
//        for(int i = 1; i <= n; i++) {
//            int factors = getFactorCount(i);
//            System.out.println("Number: " + i + ", Factors: " + factors);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        printFactorsUpToN(n);
//    }
//}



