// 4-3-2024 By Ankit Sir

import java.util.*;
class A
{
    void Sum(int a,int b)
    {
        System.out.println("Sum of a&b="+(a+b));
    }
    
    void Sum(int a,int b,int c)
    {
        System.out.println("Sum of a,b&c="+(a+b+c));
    }

    void Sum(double a,double b)
    {
        System.out.println("Sum of a&b="+(a+b));
    }

    public static void main(String args[])
    {
        A obj = new A();
        obj.Sum(10,20);
        obj.Sum(10,20,30);
        obj.Sum(10.20,20.30);
    }
}