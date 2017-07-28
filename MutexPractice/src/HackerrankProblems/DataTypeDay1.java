package HackerrankProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypeDay1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
       int x = Integer.parseInt(scan.nextLine());
        double dd = Double.parseDouble(scan.nextLine());
       String sd = scan.nextLine();
        System.out.println(i+x);
        System.out.println(d+dd);
        System.out.println(s+""+sd);
        scan.close();
    }
}