package Method_Overloading;

class Calc{
  public static int add(int a, int b){
        return a+b;
    }
    public static float add(int a, float b){
      return a+b;
    }
    public static double add(double a, char b){
      return a+b;
    }
    public static void add(){
        System.out.println("HI");
    }
}

public class Day30 {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
        System.out.println( c.add(10,20));
    }
}
