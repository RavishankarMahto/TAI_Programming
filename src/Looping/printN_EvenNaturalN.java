package Looping;
import java.util.Scanner;

public class printN_EvenNaturalN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Input: number of even natural numbers to print

        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
    }
}

