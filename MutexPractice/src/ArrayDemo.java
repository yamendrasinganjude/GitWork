import java.util.Scanner;

/**
 * Created by Vishal on 7/14/2017.
 */
public class ArrayDemo
{
    static String evenNumber = "";
    static String oddNumber = "";
    public static void getData(Scanner scanner,int numbers[])
    {

        String resultHeader="";
        for(int i=0;i<5;i++)
        {
            numbers[i]=scanner.nextInt();
            if (numbers[i] % 2 == 0)
            {
                evenNumber = evenNumber+"Square of "+numbers[i] + " is "+numbers[i]*numbers[i]+"\n";
            }
            else
            {
                oddNumber = oddNumber + "Cube of " +numbers[i] + " is "+numbers[i]*numbers[i]*numbers[i]+"\n";
            }
        }
    }
    public static void printData()
    {
        System.out.println("Square of Even Number is " +evenNumber);
        System.out.println("Cube of Odd Numbers is " +oddNumber);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5];

        getData(scanner,numbers);
        printData();
    }
}
