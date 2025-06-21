package Array;  // biggest number possible in Java: 2147483647

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }

        // int min = ar[0]; // by assuming the first element is the smallest.
        // line sets a variable min to the largest possible number in Java
        // for(int i = 1; i < ar.length; i++) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {// 2147483647
                min = ar[i];
            }
        }
        System.out.println(min);
    }
}
