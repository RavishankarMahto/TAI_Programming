package Pattern;

public class Pattern11 {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j<10)
                {
                    System.out.print("0");
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
