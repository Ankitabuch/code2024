package may4.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collection {

          public static void main(String[] args){

              ArrayList<Integer> a = new ArrayList<>();
              a.add(10);
              a.add(60);
              a.add(50);
              a.add(40);
              a.add(10);
              a.add(60);
              System.out.println("ArrayList");
              System.out.println(a);
              List<Integer> a1 = new ArrayList<>();
              a1.add(50);
              a1.add(60);
              a1.add(70);

              a.add(3,89);
              System.out.println(a.get(3));
              System.out.println(a); //after adding 89 at index 3


              a.addAll(a1);
              System.out.println(a); //after adding a1 to a
              System.out.println("Size of the a " +a.size());

              List<Integer> list = new LinkedList<>();

              list.add(1);
              list.add(2);
              list.add(3);
              list.add(7);
              list.add(5);
              list.add(4);
              System.out.println("LinkedList");
              System.out.println(list);
              System.out.println(list.reversed());
              boolean contains = list.contains(7);
              System.out.println(contains);

          }
}
