package Pattern;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(( i==0 && j==n-1) || (i==n-1 && j==n-1) ||( i==0 && j==0) || (i==n-1 && j==0))
                {
                    System.out.print("- ");
                }
                else if (i == 0 || j == n-1 || i==n-1 ||j==0){
                    System.out.print("* ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}

