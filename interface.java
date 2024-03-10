// Define the interface for executable programs
interface Executable {
    // Abstract methods to be implemented by subclasses
    void compile();
    void run();
  }
  
  // Implement the interface
  class MyJavaProgram implements Executable {
    public void compile() {
      System.out.println("Compiling MyJavaProgram...");
    }
  
    public void run() {
      System.out.println("Running MyJavaProgram...");
    }
  }
  
  // Main class
class Main {
    public static void main(String[] args) {
      // Create an object of the class that implements the interface
      Executable myJavaProgram = new MyJavaProgram();
  
      // Call methods of the interface
      myJavaProgram.compile();
      myJavaProgram.run();
    }
  }
  