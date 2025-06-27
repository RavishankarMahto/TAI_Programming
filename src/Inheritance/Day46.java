package Inheritance;


class Parent{
    static {    // static block
        System.out.println("Inside static block of parent");
    }
    {  // instance block
        System.out.println("Inside instance block of parent");
    }
    Parent() {   // constructor
        System.out.println("Inside parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Inside static block of child");
    }
    {
        System.out.println("Inside instance block of child");
    }
    Child() {
        System.out.println("Inside parent constructor");
    }
}



public class Day46 {
    public static void main(String[] args) {
        Child c=new Child();
        Object object;
    }
}
