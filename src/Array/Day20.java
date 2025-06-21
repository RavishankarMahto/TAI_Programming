package Array;

import java.util.Scanner;

public class Day20
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of schools: ");
        int school = sc.nextInt();
        System.out.println("Entet the number of class: ");
        int classes = sc.nextInt();
        System.out.println("Enter the number of students: ");
        int student = sc.nextInt();

        int[][][] arr = new int[school][classes][student];

        // store
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.println("Enter the number of school "+(i+1)+" class "+(j+1)+ " student "+(k+1));
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        //print
        System.out.println("The age of students are: ");
        for(int i=0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                for(int k=0; k<arr[i][j].length; k++)
                {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }

    }
}
