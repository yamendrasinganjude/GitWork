package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        List lst = new ArrayList();
        List lst1 = new ArrayList();

        lst.add("vishal");
        lst.add(8);
        lst.add(7.4);
        //ArrayListDemo.print(lst);

        lst.add(3, 9.3);
        //ArrayListDemo.print(lst);

        lst.add(2,2);
        //ArrayListDemo.print(lst);

        lst1.add("Vishal");
        lst1.add(1,8);
        lst1.add(4);
        ArrayListDemo.print(lst1);

        lst.removeAll(lst1);
        ArrayListDemo.print(lst);

        lst1.remove(1);
        ArrayListDemo.print(lst1);

        lst.addAll(lst1);
        ArrayListDemo.print(lst);

        //this method for retain on two list
        lst.retainAll(lst1);
        ArrayListDemo.print(lst);

        lst.clear();
        lst1.clear();
        System.out.println(lst);
        System.out.println(lst1);
//        Object x = lst.get(0);  //element search by using index
//        System.out.println("\nElement of that Index is "+x);
    }
    public static void print(List lst)
    {
        //for (int i=0;i<lst.size();i++)
        for(Object i : lst)
        {
            System.out.print(i+" ");
            //System.out.println(lst.get(i)+ " ");
        }
        System.out.println();
    }
    public static void print1(List lst1)
    {
        for(Object i : lst1)
        {
            System.out.print(i+" ");
            //System.out.println(lst.get(i)+ " ");
        }
        System.out.println();
    }
}
