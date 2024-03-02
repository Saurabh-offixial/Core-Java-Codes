public class ATJOIN extends Thread {

    public void run()
    {
        String n = Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
            System.out.println(n);
        }
    }
public static void main(String[] args) {
    ATJOIN t1 = new ATJOIN();
    ATJOIN t2 = new ATJOIN();
    ATJOIN t3 = new ATJOIN();
    t1.setName("kem cho majma");
    t2.setName("chal nikad");
    t3.setName("ha ha dekh luga");
    t2.start();
    try{
        t1.join();
        t3.join();
    }
    catch(InterruptedException i)
    {

    }
    t1.start();
    t3.start();

}

}
