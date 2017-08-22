package jvm;
import java.lang.reflect.Method;

public class Test
{
    public static void main(String[] args) throws ClassNotFoundException {
        int count=0;
        //Class student = Class.forName("jvm.Student");
        Student s1 = new Student();
        Method m[] = s1.getDeclaredMethod()
        for(Method m1:m)
        {
            count++;
            System.out.println(m1.getName());
            Student.getNumber();
            Student.getState();
        }
        System.out.println(count);
    }
}
