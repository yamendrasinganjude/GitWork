package thread;

public class PrintJob implements Runnable
{
    String name;
    PrintJob(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println(name+" job started by thread "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception Caught");
        }
        System.out.println(name+" job completed by thread "+Thread.currentThread().getName());
    }
}