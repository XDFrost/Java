// Same method name when used by both base and derived class, then the method of derived class overrides that of base
// Redefining methods of super class
// Only public methods can be overrided



class A {
    public int give() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am 2nd method of class A");
    }
}

class B extends A {
    public void Bmeth() {
        System.out.println("I am a method of class B");
    }
    
    @Override                                                      // Notation
    public void meth2() {
        System.out.println("I am 2nd method of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
