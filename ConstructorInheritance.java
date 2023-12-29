// If there is no constructor of derived class, it calls the constructor of base class
// Even if derived class has a contrucor, base class constructor will always run and will run first
// If we want the derived class to run the parameterized constructor of base class, we'll use super keyword to initailizze parameters in derived class constructor
// Super keyword takes parameters in the derived class constructor to choose which constructor of base class it'll use
/* 
    Ex:
            base(int a) {
                body
            }

            derived() {
                super(value)
                body
            }
*/



class Base {        

    Base () {                                            // Constructor
        System.out.println("I am a base class constructor");
    }

    Base (int a) {                                       // Constructor
        System.out.println("I am a base class overloaded constructor with value: " + a);
    }
    
}

class Derived extends Base {

    Derived() {                                                         // Will run for no parameter constructor
            System.out.println("I am a derived class constructor");
    }

    Derived(int x) {                                                            // Will run for parameter constructor
        super(2);
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a derived class overloaded constructor with values: " + x + " " + y);
    }

}

class childOfDerived extends Derived {

    childOfDerived() {
        System.out.println("I am a child of derived constructor");
    }
    
    childOfDerived(int x, int y, int z) {
        super(x,y);
        System.out.println("I am a overloaded constructor of childOfDerived and child of derived constructor");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        // Derived d = new Derived();
        // Derived d = new Derived(2);
        // Derived d = new Derived(2, 4);
        childOfDerived cd = new childOfDerived(1,2,3);
    }
}
