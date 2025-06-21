package Array;

import java.util.Scanner;

public class LargestElement {

    public static void largestNumber(int[] ar){
        int max = ar[0];
        for(int i=1; i<ar.length; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        System.out.println(max);
    }




    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] ar = new int[n];

        for(int i=0; i<ar.length; i++){
            ar[i] = scan.nextInt();
        }
        largestNumber(ar);
    }
}

