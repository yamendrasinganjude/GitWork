package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo
{
    public static void main(String[] args)
    {
        PrintJob jobs[] = {new PrintJob("vishal"),new PrintJob("nehal"),new PrintJob("mukesh"),new PrintJob("akshay"),new PrintJob("gaurav")};
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (PrintJob job:jobs) {
            service.submit(job);
        }
        service.shutdown();
    }
}
