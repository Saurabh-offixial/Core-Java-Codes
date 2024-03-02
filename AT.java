//extand's thared

public class AT extends Thread {
    public void run()
    {
        String n = Thread.currentThread().getName();
        for (int i=1; i<=3; i++)
        {
            System.out.println(n);
        }
    }
public static void main(String[] args) {
    AT t1 = new AT();
    AT t2 = new AT();
    t1.setName("hello");
    t2.setName("chal nikad");
    t1.start();
    t2.start();
}
}
