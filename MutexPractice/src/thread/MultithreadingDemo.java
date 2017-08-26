package thread;

public class MultithreadingDemo extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("Tread " + Thread.currentThread().getId() + " is running.");
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
        }
    }
    public static void main(String[] args)
    {
        int n=5;
        for (int i=0;i<=n;i++)
        {
            MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}
