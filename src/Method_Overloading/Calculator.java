package Method_Overloading;

class Calculator1{
    public static void add1(int a, char b){
        System.out.println("int char");
    }
    public static void add(char a, int b){
        System.out.println("char, int");
    }
}

public class Calculator {

    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
      //  calc.add('A', 'B'); // ambiguity error because all these thingsd are same like same name, same num of param.. and same sequesnce of param.....
        calc.add('A','B'); // change the method name
    }
}
