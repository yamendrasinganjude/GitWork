package jvm;

public class Student
{
    String name;
    int RollNo;
    public String getState()
    {
        //System.out.println("Maharashtra\n");
        return  "Maharashtra";
    }
    public void setState(String name)
    {
        this.name = name;
    }
    public int getNumber()
    {
        //System.out.println("123");
        return 123;
    }
    public void setRollNo(int Rollno)
    {
        this.RollNo = Rollno;
    }
}
