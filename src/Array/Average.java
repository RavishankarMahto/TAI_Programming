package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] a = new int[input];

        for(int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum +=a[i];
        }
        float leng=a.length;
        float avg = sum/leng;
        System.out.printf("%.2f",avg);
    }
}
