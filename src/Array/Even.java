package Array;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        int[] ar = new int[input];

        for(int i=0; i<ar.length; i++){
            ar[i] = scan.nextInt();
        }
        for(int num : ar){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }
}
