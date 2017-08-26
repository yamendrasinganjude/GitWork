package thread;

public class ThreadMain extends Thread
{
    public void run()
    {
        System.out.println("Thread "+Thread.currentThread().getId()+" is run.");
        System.out.println("Active thread Count is "+Thread.activeCount());
        System.out.println("Current Thread Name "+Thread.currentThread().getName());
        System.out.println("Thread state is "+Thread.currentThread().getState());
        System.out.println(Thread.getAllStackTraces());
        System.out.println("Priority is "+Thread.currentThread().getPriority());
        System.out.println("Maximum Priority is "+Thread.MAX_PRIORITY);
    }
    public static void main(String[] args)
    {
        ThreadMain t = new ThreadMain();
        t.start();
    }
}
