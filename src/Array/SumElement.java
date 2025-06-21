package Array;

import java.util.Scanner;

public class SumElement {

    public static int totalSum(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum +=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for(int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        int res = totalSum(a);
        System.out.println(res);
    }
}
