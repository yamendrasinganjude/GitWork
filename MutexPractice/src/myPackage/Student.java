package myPackage;

import java.util.Scanner;

/**
 * Created by Vishal on 7/17/2017.
 */
public class Student
{

    private String Name;
    private int rollNumber;
    private float Marks;

    public void setName(String name)
    {
        Name = name;
    }
    public String getName()
    {
        return Name;
    }
    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }
    public int getRollNumber()
    {
        return this.rollNumber;
    }
    public void setMarks(float marks)
    {
        this.Marks = marks;
    }
    public  float getMarks()
    {
        return Marks;
    }
}