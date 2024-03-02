import java.util.*;
public class MyThread extends Thread {

  public void run() {
    // This code will be executed by the new thread
    System.out.println("This is running in a new thread!");
    for (int i = 0; i < 5; i++) {
      System.out.println("Iteration " + i + " in the new thread");
      try {
        Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
        
      }
    }
  }

  public static void main(String[] args) {
    // Create a new thread object
    MyThread thread = new MyThread();

    // Start the thread
    thread.start();

    // Print from the main thread
    System.out.println("This is running in the main thread!");
  }
}