package Array;

import java.util.Scanner;

public class  absoluteSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        int absoluteSum = 0;

        // Read the array elements and calculate the absolute sum
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            absoluteSum += Math.abs(arr[i]);  // Take absolute value
        }
        System.out.println(absoluteSum);
    }
}
