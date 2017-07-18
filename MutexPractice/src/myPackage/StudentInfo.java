package myPackage;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

class StudentInfo
{
    public static void main(String[] args)
    {
        int rollNumber;
        String Name;
        float Marks;
        StudentInfo studentInfo = new StudentInfo();
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Students Information : ");
        Name = scanner.nextLine();
        rollNumber = Integer.parseInt(scanner.nextLine());
        Marks = Float.parseFloat(scanner.nextLine());
        student.setName(Name);
        System.out.println(student.getName());
        student.setRollNumber(rollNumber);
        System.out.println(student.getRollNumber());
        student.setMarks(Marks);
        System.out.println(student.getMarks());
    }
}
