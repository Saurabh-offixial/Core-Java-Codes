// 4-3-2024 By Ankit Sir
// (java Trial) Call this
import java.util.*;
class A
{
    public void display()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    public void display()
    {
        System.out.println("Class B");
    }
}
class Trial
{
    public static void main(String args[])
    {
        A a = new A();
        A b = new B();
        a.display();
        b.display();
    }
}