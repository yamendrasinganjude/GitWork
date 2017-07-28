package HackerrankProblems;
import java.io.*;
import java.util.*;

public class DiffBetClassInstance
{
    private int age;

    public DiffBetClassInstance(int initialAge) {
        System.out.println("Age is not valid, setting age to 0.");
    }

    public void amIOld() {
        if(age<13)
        {
            System.out.println("You are young.");
        }
        if(age>=13 && age<18)
        {
            System.out.println("You are a teenager.");
        }
       // else
        //{
         //   System.out.println("You are old.");
      //  }
    }

    public void yearPasses() {
        age++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            DiffBetClassInstance d = new DiffBetClassInstance(age);
            d.amIOld();
            for (int j = 0; j < 3; j++) {
                d.yearPasses();
            }
            d.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
