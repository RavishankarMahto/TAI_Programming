package Looping;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        pFactor(n);
    }

    public static void pFactor(int n){
        System.out.println("Factor of "+n+" is: ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
