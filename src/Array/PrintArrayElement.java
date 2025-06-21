package Array;

import java.util.Scanner;

public class PrintArrayElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.println("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
