package thread;

public class MultithreadRun implements Runnable
{
    public void run()
    {
        int count=0;
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is Running.");
        }
        catch(Exception a)
        {
            System.out.println("Exception caught.");
        }
        System.out.println("Total thread is "+count);
    }
    public static void main(String[] args)
    {
        int n = 7;
        for (int i=0;i<n;i++)
        {
            Thread thread = new Thread(new MultithreadRun());
            thread.start();
        }
    }
}
