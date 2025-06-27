package Object_Class;

class Employee{  // extends Object
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
       // return id+" "+name+" "+salary;
        return "Hi";
    }
}
public class Day46 {
    public static void main(String[] args) {
        Employee e=new Employee(1,"Ravi",98789);
        //System.out.println(e);  // hashcode got in output
        System.out.println(e); // internally java attach -> toString
    }
}
// if we have address toString is inherited,
// if we have value toString is overridden
