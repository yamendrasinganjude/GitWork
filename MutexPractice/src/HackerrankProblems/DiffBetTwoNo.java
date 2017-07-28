package HackerrankProblems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DiffBetTwoNo
{
    private int[] elements;
    public int maximumDifference;

    public DiffBetTwoNo(int n)
    {

    }

    public void computeDiffBetTwoNo() {
        int n;
        n = elements.length;
        int min = 100;
        int max = 1;
        for (int i = 0; i < n; ++i)
        {
            if (elements[i] < min)
            {
                min=elements[i];
            }
            if (elements[i] > max)
            {
                max=elements[i];
            }
        }
        maximumDifference=max-min;
    }
}
 // End of Difference class
