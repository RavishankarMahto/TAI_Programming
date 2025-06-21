package Array;

import java.util.Scanner;

public class Day18
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of class: ");
        int classes = scan.nextInt();
        System.out.println("Enter the number of students");
        int students = scan.nextInt();

        int[][] arr = new int[classes][students];

        //store
        //class
        for(int i=0; i<arr.length; i++)
        {
            //student
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter the age of "+(i+1)+"class and "+(i+1)+" students: ");
                arr[i][j] = scan.nextInt();
            }
        }
        //print
        //class
        System.out.println("The ages of students are: ");
        for(int i=0; i<arr.length; i++)
        {
            //student
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
