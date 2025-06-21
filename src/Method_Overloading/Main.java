package Method_Overloading;

import java.sql.SQLOutput;

public class Main {

    public static void main(){  // zero parameter
        System.out.println("1");
        main(2,4);
    }
    public static void main(String[] args) {  // overloaded the main method
        System.out.println("2");
        main();
       // main(2,4);
    }
    public static void main(int a, int b) {
        System.out.println("4");
    }
    public static void main(int a, float b, double c){
        System.out.println("3");
    }
    public static void main(float a, double b, char c){
        System.out.println("5");
    }
}
