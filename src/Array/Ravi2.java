package Array;

import java.util.Scanner;

public class Ravi2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // take from user input
        System.out.println("Enter the number of classrooms");
        int Class = scan.nextInt();
        System.out.println("Enter the age of students: ");
        int student = scan.nextInt();

        // initialize an array
        int[][] a = new int[Class][student];

        //store
        //class data
        for(int i=0; i<Class; i++)
        {
            // student data
            for(int j=0; j<student; j++)
            {
                System.out.println("Enter the number of "+(i+1)+ " class and age of "+(j+1)+" students");
                a[i][j] = scan.nextInt();
            }
        }
        //print or retrieve
        //class
        System.out.println("The ages of students are: ");
        for(int i=0; i<Class; i++)
        {
            //student
            for(int j=0; j<student; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
