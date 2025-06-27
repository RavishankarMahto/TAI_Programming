package Object_Class;

import javax.swing.*;

public class Demo1 {
    public static void main(String[] args) {
        String s1=new String("JAVA");
        String s2=new String("JAVA");

        boolean n=s1.equals(s2);   // OVERRIDDEN
        System.out.println(n);  // true bcz string compare value -> JAVA = JAVA

        StringBuffer st1=new  StringBuffer("JAVA");
        StringBuffer st2=new  StringBuffer("JAVA");

        boolean n1=st1.equals(st2);  // INHERITED
        System.out.println(n1);    // false bcz stringBuffer compare address -> st1 != st2
    }
}
