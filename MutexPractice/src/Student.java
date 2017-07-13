import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Vishal on 7/13/2017.
 */
public class Student
{
    int rollNo;
    float marks;
    String name;
}
class StudentApp
{
    Student student = new Student();
    public static void main(String args[])
            throws IOException
    {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedreader = new BufferedReader(inputStreamReader);
        Student student1 = acceptData(bufferedreader);
        Student student2 = acceptData(bufferedreader);
        Student student3 = acceptData(bufferedreader);
        printData(student1);
        printData(student2);
        printData(student3);
    }
    static Student acceptData(BufferedReader bufferedreader)
            throws IOException
    {
        Student student = new Student();
        System.out.println("Enter Name : ");
        student.name = bufferedreader.readLine();
        System.out.println("Enter Rollno : ");
        student.rollNo=Integer.parseInt(bufferedreader.readLine());
        System.out.println("Enter Marks : ");
        student.marks = Float.parseFloat(bufferedreader.readLine());
        return student;
    }
   static void printData(Student student)
    {
        System.out.println("name : "+student.name);
        System.out.println("Rollno : "+student.rollNo);
        System.out.println("Marks : "+student.marks);
    }

}


