package jvm;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test
{
    public static void main(String[] args) throws ClassNotFoundException {
        int count=0;
        //Class student = Class.forName("jvm.Student");
        Student s1 = new Student();
        Class c1 = s1.getClass();
        System.out.println(c1.getName());
        Method m[] = c1.getDeclaredMethods();
        for(Method m1:m)
        {
            count++;
            System.out.println(m1.getName());
            //s1.getNumber();
            //s1.getState();
        }
        Field f[] = c1.getDeclaredFields();
        for(Field field : f)
        {
            System.out.println(field.getName());
        }
        System.out.println(count);
    }
}
