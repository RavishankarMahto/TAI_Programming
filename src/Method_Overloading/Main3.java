package Method_Overloading;

class Calculator2{
    int add(int a, char b){
        System.out.println("int,char");
        return 100;
    }
    void add(char a, byte b){
        System.out.println("chae,byte");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        calc.add('A','B');
    }
}
