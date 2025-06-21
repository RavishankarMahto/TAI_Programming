package Array;

import java.util.Scanner;

public class TwoD_Jagged
{
    public static void main(String[] args) {
        // i having 2 classroom and each classroom having different student
        // first classroom 3 students
        // second classroom 5 students

        Scanner scan = new Scanner(System.in);

        int[][] a = new int[2][];
        a[0] = new int[3];
        a[1] = new int[5];

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println("Class "+(i+1)+" Student "+(j+1));
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("The ages are: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
