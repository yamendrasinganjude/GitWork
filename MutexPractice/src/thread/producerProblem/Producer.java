package thread.producerProblem;

public class Producer extends Thread
{
    Godown godown;
    Producer(Godown g)
    {
        this.godown=g;
    }
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            try
            {
                godown.getPush();
            }
            catch (InterruptedException e)
            {
                //System.out.println(e);
            }
            System.out.println("Item "+i+" Pushed in godown");
        }

    }
}
