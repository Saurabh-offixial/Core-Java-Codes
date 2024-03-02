// join method with sleep method

public class ATJOIN1 extends Thread {

    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
            System.out.println(n);
            
        }
    }
public static void main(String[] args) {
    ATJOIN1 t1 = new ATJOIN1();
    ATJOIN1 t2 = new ATJOIN1();
    ATJOIN1 t3 = new ATJOIN1();
    t1.setName("kem cho majma");
    t2.setName("chal nikad");
    t3.setName("ha ha dekh luga");
    t2.start();
    try{
        t1.join();
        t3.join();
        //you can also use join method in sleep method
        Thread.sleep(20000);
    }
    catch(InterruptedException i)
    {

    }
    t1.start();
    t3.start();

}

}
