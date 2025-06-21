package Method_Overloading;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello");
       // return 10;          //we can't return main method bcz jvm only give he can't take
        int n = add();
        int m = sub();
        System.out.println(n);
        System.out.println(m);
    }
    public static int add(){
        return 10;
    }public static int sub(){
        return -10;
    }
}
