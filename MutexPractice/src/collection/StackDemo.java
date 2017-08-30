package collection;

import java.util.Stack;
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        System.out.println("Name = "+s.push("Vishal"));
        for(int i=0; i<=10;i++)
        {
            System.out.println("Element "+i+" Push Sucessfully.");
            s.push(i);
        }
        System.out.println("\n"+"Search by offset "+s.search(7)+" Element."+"\n");
        for (int j=0;j<=10;j++) {
            System.out.println("Element " + j + " PoP Sucessfully : "+s.pop());
        }
        System.out.println(s.pop()+" is Deleted/pop.");
    }
}
