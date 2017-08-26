package thread.producerProblem;

public class Consumer extends Thread
{
    Godown godown;
    Consumer(Godown g)
    {
        this.godown=g;
    }
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            try
            {
                godown.sellsItem();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Item "+i+" Peakup from the godown.");
        }
    }
}
