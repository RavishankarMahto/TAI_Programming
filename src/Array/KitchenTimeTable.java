package Array;

import java.util.Scanner;

public class KitchenTimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // number of students
            int[] A = new int[N]; // end times
            int[] B = new int[N]; // cooking times

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                int availableTime;
                if (i == 0) {
                    availableTime = A[0];
                } else {
                    availableTime = A[i] - A[i - 1];
                }

                if (B[i] <= availableTime) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}

/*
Input
        2
        3
        1 10 15
        1 10 3
Output
        2
Input
        3
        10 20 30
        15 5 20

Output
        1
*/
