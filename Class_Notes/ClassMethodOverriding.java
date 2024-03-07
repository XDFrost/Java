package Class_Notes;

class Base1 {
    int i, j;
    Base1(int a, int b) {
        i = a;
        j = b;
    }
    void display() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

class subclass extends Base1 {
    double d;
    subclass(int x, int y, int z) {
        super(x, y);
        d = z;
    }

    // Overriding 
    void display() {
        // super.display();
        System.out.println("d = " + d);
    }
}

public class ClassMethodOverriding {
    public static void main(String[] args) {
        subclass obj = new subclass(1, 2, 3);
        obj.display();
    }
}
