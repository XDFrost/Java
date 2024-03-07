// This is way to reference object of a class to be created; therefore, changes will also be seen in obj, not only in class
// Used in order to pass the same object in a method

// super keyword is used to refer immediate parent class object



class Keyword {
    int a;

    Keyword(int a) {
        this.a = a;
    }

    // Keyword() {
    //     System.out.println("Default constructor");
    // }

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


// If this is not used, then the value of num will be 0 because the compiler will think that the num in the constructor is the same as the num in the class i.e. num is not global
