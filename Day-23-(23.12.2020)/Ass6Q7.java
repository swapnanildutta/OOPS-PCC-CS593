public class Ass6Q7 {
    public static void main(String[] args)
    {
        Sharable sh=new Sharable();
        Consumer c=new Consumer("Consumer", sh);
        Producer p=new Producer("Producer", sh);
    }
}
class Sharable
{
    int items=0;
    synchronized void produce() {
        System.out.println(Thread.currentThread().getName()+" is prodcucing");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        items+=1;
        notify();
        System.out.println(Thread.currentThread().getName()+" has finished production");

    }
    synchronized void consume() {
        System.out.println(Thread.currentThread().getName()+" is consuming");
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        items-=1;
        System.out.println(Thread.currentThread().getName()+" has finished  consumption and "+items+" are left");
    }

}
class Producer extends Thread
{
    Sharable sh;
    public Producer(String name, Sharable sh)
    {
        super(name);
        this.sh=sh;
        start();
    }
    public void run()
    {
        sh.produce();
    }

}
class Consumer extends Thread
{
    Sharable sh;
    public Consumer(String name, Sharable sh)
    {
        super(name);
        this.sh=sh;
        start();
    }
    public void run()
    {
        sh.consume();
    }

}
