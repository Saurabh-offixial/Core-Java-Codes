import java.util.*;
class A extends Thread
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        try
        {
            for(int i=0;i<=3;i++)
            {
                System.out.println("Saurabh");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {

        }
        }
        public static void main(String args[])
        {
            A t1 = new A();
            A t2 = new A();
            A t3 = new A();

            t1.setName("Thread1");
            t2.setName("Thread2");
            t3.setName("Thread3");
        
            t1.start();
            t2.start();
            t3.start();
    }
}