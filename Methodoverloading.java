/**
 * Methodoverloading
 */
public class Methodoverloading {

    void add()
    {
        int a=10,b=20;
        System.out.println("ADD:" + (a + b));

    }
    void add(int a,int b)
    {
        System.out.println("ADD"+(a+b));
    
    }
    public static void main(String[] args) {
        Methodoverloading A1 = new Methodoverloading();
        A1.add();
        A1.add(30,20);
    }


}