import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Vishal on 7/15/2017.
 */
public class PrimeNo
{
    public static void main(String[] args)
    {
        int i = 0;
        int num = 0;
        String primeNumber = " ";
        for (i = 0; i <= 100; i++)
        {
            int counter = 0;
            for (num = i; num >= 1; num--)
            {
                if (i%num == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                primeNumber = primeNumber + i + " ";
            }
            System.out.println("Prime numbers from 1 to 100 are ");
            System.out.println(primeNumber);
        }
    }
}