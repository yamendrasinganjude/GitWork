package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<Object> list = new LinkedList<>();
        LinkedList<Object> list1 = new LinkedList<>();

        //Generating list One
        list.add("Singanjude");
        list.addFirst("Vishal");
        list.addLast(8);
        list.addLast("GonDia");
//        LinkedListDemo.print(list);

        //Generating list Two
        list1.add("Singanjude");
        list1.add(02);
        list1.addLast("GonDia");
        list1.addFirst("Bablu");
        Iterator iterator = list.listIterator();
        Iterator iterator1 = list1.listIterator();
        System.out.println("This is First List....");
        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+"  ");
        }
        System.out.println("\nThis is second List....");
        while (iterator1.hasNext())
        {
            System.out.print(iterator1.next()+"  ");
        }

        // You can use this Types also.
//        LinkedListDemo.print(list1);
    }
//    private static void print(List list)
//    {
//        for (Object object : list)
//        {
//            System.out.print(object+" ");
//        }
//        System.out.println();
//    }
}
