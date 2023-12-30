// This is way to reference object of a class to be created
// Used in order to pass the same object in a method

// super keyword is used to refer imediate parent class object



class Keyword {
    int a;

    Keyword(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }

    public int getA() {
        return a;
    }
}

class key extends Keyword{
    key(int c) {
        super(c);
        System.out.println("This is a constructor of derived class");
    }
}

public class ThisSuperKeyword {
    public static void main(String[] args) {
        Keyword k = new Keyword(5);
        key d = new key(100);

        System.out.println(k.getA());
        System.out.println(d.getA());
    }
}
