package may7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {
                // Object next = iterator.next();
                Integer next = iterator.next();
                if(next==10) {
                    //list.remove(new Integer(10));--- Error
                    iterator.remove();
                }
            }
        System.out.println(list);
        }
    }