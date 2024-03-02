// public class Methodoverriding {
//     void show(){
//         System.out.println("SHOW THE METHOD OF CLASS A");
//     }
// }
// public class HI extends Methodoverriding {
//     void show()
//     {
//         System.out.println("show the method of class b");
//     }
// public static void main(String[] args) {
//     HI k = new HI();
//     k.show();
// }

    
// }
public class Methodoverriding {
    void show() {
        System.out.println("SHOW THE METHOD OF CLASS A");
    }
}

public class C extends Methodoverriding {
    void show() {
        System.out.println("show the method of class b");
    }

    public static void main(String[] args) {
        C k = new C();
        k.show();
    }
}
