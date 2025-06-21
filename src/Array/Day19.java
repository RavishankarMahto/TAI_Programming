package Array;

import java.util.Scanner;

class Day19
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classroom: ");
        int classroom = sc.nextInt();
        System.out.println("Enter the height of students: ");
        int students = sc.nextInt();

        float[][] arr = new float[classroom][students];

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println("Enter the height of class "+(i+1)+" and height of "+(j+1)+" students");
                arr[i][j] = sc.nextFloat();
            }
        }

        System.out.println("The height of students are: ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
