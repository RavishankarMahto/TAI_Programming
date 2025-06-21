package Looping;
import java.util.Scanner;

public class find_LCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int lcf = -1; // To store the lowest common factor > 2

        int min = Math.min(n, m);

        // Start from 3 (since we exclude 1 and 2) up to the smaller of n and m
        for (int i = 3; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                lcf = i;
                break;
            }
        }

        if (lcf != -1) {
            System.out.println(lcf);
        } else {
            System.out.println("No common factor greater than 2");
        }
    }
}

