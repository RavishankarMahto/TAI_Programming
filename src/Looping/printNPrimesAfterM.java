package Looping;

import java.util.Scanner;

public class printNPrimesAfterM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int count = 0;
        while(count<N){
            if(checkPrime(M)){
                System.out.print(M+" ");
                count++;
            }
            M++;
        }
    }
    public static boolean checkPrime(int n){
        if(n<1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
