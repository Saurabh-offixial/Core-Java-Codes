import java.util.*;

class Message {
    public synchronized void show(String name) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("how are you " + name);
        }
    }
}

class MyThread1 extends Thread {
    Message m;
    String name;

    MyThread1(Message m, String name) {
        this.m = m;
        this.name = name;
    }

    public void run() {
        m.show(name);
    }
}

class MyThread2 extends Thread {
    Message m;
    String name;

    MyThread2(Message m, String name) {
        this.m = m;
        this.name = name;
    }

    public void run() {
        m.show(name);
    }
}

class A {
    public static void main(String args[]) {
        Message m = new Message(); // Corrected object creation

        // Create and start MyThread1 instance
        MyThread1 t1 = new MyThread1(m, "Saurabh");
        t1.start();

        // If you need a second thread, uncomment and correct the following:
        MyThread2 t2 = new MyThread2(m, "Diya");  // Assuming MyThread2 exists
        t2.start();
    }
}
