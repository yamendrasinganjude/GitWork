package collection;

import java.io.UTFDataFormatException;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentData
{
   public static int count = 0;
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Student> students1 = new ArrayList<Student>();
        students.add(new Student("Nehal",31));
        students1.add(new Student("Vishal",52));
        students.add(new Student("Gaurya",47));
        students.add(new Student("zabya",59));
        students1.add(new Student("Mukya",30));
        students.add(new Student("Akshay",17));
        students1.add(new Student("Rakya",38));
        Iterator iterator = students.iterator();
        System.out.println("This is first list");
        while(iterator.hasNext())
        {
            Student student = (Student)iterator.next();
            System.out.println("Name : "+student.name+"\t\tRoll No : "+student.rollno);
            count++;
        }
        Iterator iterator1 = students1.iterator();
        System.out.println("This is Second list....");
        while (iterator1.hasNext())
        {
            Student student = (Student)iterator1.next();
            System.out.println("Name : "+student.name+"\t\tRoll No : "+student.rollno);
            count++;
        }
        System.out.println("Total count : "+count);
    }
}
