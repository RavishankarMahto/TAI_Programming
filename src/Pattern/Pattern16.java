package Pattern;


public class Pattern16 {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if(i==j ||(i==0 && j==n-1) ||(i==n-1 && j==0)  || (i>0 && i<n-1 && j==n-i-1))
                   //if(i==j || j==n-i-1) both are same
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


