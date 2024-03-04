// Single Inheritance Program.

import java.util.*;

class Employee 
{
    float salary=35000*12;
}

class Excecute extends Employee
{
    float bonus=4500*6;
    public static void main(String args[])
    {
        Excecute obj = new Excecute();
        System.out.println("Salary is:"+obj.salary);
        System.out.println("Bonus is:"+obj.bonus);
    }
}
