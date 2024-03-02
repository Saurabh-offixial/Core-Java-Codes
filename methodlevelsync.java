import java.util.*;

class Table {
    public void synchronized printTable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(n * i);
        }
        System.out.println();
    }
}

class thread1 extends Thread {
    Table t;

    thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class thread2 extends Thread {
    Table t;

    thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(10);
    }
}

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        thread1 t1 = new thread1(table);
        thread2 t2 = new thread2(table);

        t1.start();
        t2.start();
    }
}
