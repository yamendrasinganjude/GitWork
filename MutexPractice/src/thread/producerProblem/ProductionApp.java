package thread.producerProblem;

public class ProductionApp
{
    public static void main(String[] args)
    {
        Godown g = new Godown();
        Producer p = new Producer(g);
        Consumer c = new Consumer(g);
        p.start();
        c.start();
    }
}
