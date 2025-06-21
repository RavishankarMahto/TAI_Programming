package Array;
import java.util.Scanner;

    public class longest_Palindromic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read array size
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Initialize first and second smallest with maximum possible value
            long first = Long.MAX_VALUE;
            long second = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arr[i] < first) {
                    second = first;
                    first = arr[i];
                } else if (arr[i] < second && arr[i] != first) {
                    second = arr[i];
                }
            }

            // If no valid second smallest
            if (second == Long.MAX_VALUE) {
                System.out.println("No second smallest element");
            } else {
                System.out.println(second);
            }
        }
    }
