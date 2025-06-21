package Array;

import java.util.Scanner;

public class printEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] arr = new int[input];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for(int num : arr){
            if(num%2==0){
                System.out.print(num+" ");
            }
        }
    }

}
