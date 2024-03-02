
// sleep method in java using thread

public class ATSLEEP extends Thread{
    public void run()
    {
    String n = Thread.currentThread().getName();
    try
    {
        for (int i=1; i<=3; i++)
        {
            System.out.println(n);
            Thread.sleep(20000);
            
        }
    }
    catch(InterruptedException i)
    {
    }
}
public static void main(String[] args) {
    ATSLEEP t1 = new ATSLEEP();
    t1.setName("hello my brother");
    t1.start();
    }
    
}
