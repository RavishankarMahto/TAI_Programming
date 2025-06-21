package Collection_Framework;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday","Tuesday");
        System.out.println(list.getClass().getName());

        String[] array = {"Apple", "Banana","Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list.getClass().getName());
    }
}

















/*public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //0 index
        list.add(2); // 1 index
        list.add(80); // 2 index

//        list.add(2,50);
//        list.remove(2);
        list.set(2,50);

        for(int x: list){
            System.out.println(x);
        }

    }
}

 */









  /*  //System.out.println(list.get(2)); // 80
        System.out.println(list.size()+" ");  // check size

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println(list.contains(5)); // check for exexistance
        System.out.println(list.contains(2)); // return in true and false

       */