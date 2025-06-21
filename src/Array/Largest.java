package Array;

public class Largest
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
        int[] a = {12,23,25,28,9,11};

       int max = a[0];
       for(int i=1; i<a.length; i++)
       {
           if(max<a[i])
           {
               max=a[i];
           }
       }
        System.out.println("Max imum element is: "+max);
    }
}