package thread.producerProblem;

public class Godown
{
    public static final int capacity = 10;
    int godownItemsCount=0;
    //
    // Godown g;

    public synchronized void getPush() throws InterruptedException {
        System.out.println(godownItemsCount);
        if (capacity > godownItemsCount) {
            if (godownItemsCount == 0) {
                System.out.println("Godown is empty u walk fast.");
                notify();
            }
            godownItemsCount++;
            System.out.println("Enter Items in Godown ");
        }
        else
        {
            System.out.println("Producer Waits some time:");
            wait();
        }
    }

    public synchronized void sellsItem() throws InterruptedException {
        System.out.println(godownItemsCount);
           if (godownItemsCount==0) {
               System.out.println("Consumer Waiting :");
               wait();
           }
           else{
               if (godownItemsCount == capacity)
               {
                   System.out.println("Consumer good morning");
                   notify();
               }
               godownItemsCount--;
               System.out.println("Item is already present.");
               }
           }
    }

