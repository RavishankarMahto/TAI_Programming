package Array;

import java.util.Scanner;

public class Ravi1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the ages of Students");
        int input = scan.nextInt();

        int[] a = new int[input];

        for(int i=0; i<input; i++)
        {
            System.out.println("Enter the age of "+(i+1)+" students");
            a[i] = scan.nextInt();
        }
        System.out.println("The ages of students are: ");
        for(int i=0; i<input; i++)
        {
            System.out.println(a[i]);
        }
    }
}
