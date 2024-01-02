// Interface is a point where two systems meet and interact
/* Ex:

        TV <----> Buttons (Interface) <----> Humans
*/


// Similarly in java, it is a group of related abstract methods with empty bodies
// All methods should be abstract

// These methods should be descibed in the sub classes

// Multiple interfaces can make a new class
// Object of interfaces can't be created
// Interface methods should be made public


// We can implement multiple interfaces but we can't extends multiple classes
// i.e.
/*
    Classes ->
                public class A extends B                        Single Inheritance in classes                  Allowed 
                public class A extends B, C, D...               Multiple Inheritance in classes                Not Allowed 

    Interface ->
                public class A implements B                        Allowed
                public class A implements B, C, D...               Not Allowed
*/


// We can use both Inheritance and Interface togerther
/*
    class A extends B implements C                     Where A is Derived class; B is Base class and C is interface
*/


// Used when we have to use more than one classes or templates in some class
// Used to achieve multiple inheritance
// Interfaces are always public



class A {

}

class B {

}

class C {
    
}

interface E {

}

interface F {

}

interface G {
    
}

// class D extends A, B, C { }                // Gives error - Mentioned Above 

class D implements E, F, G { }                // Works great - Mentioned Above

class I extends A implements E, F, G { }         // Works - Mentioned Above



// We can create properties in interface
// We can't modify properties in interface because they are final



interface Bicycle {
    int a = 45;                                      // Creating property in interface
    void applybrake(int decrement);
    void speedup(int increment);
}

interface Horn {
    int x = 34;
    void blowhorn();
}

class Avon implements Bicycle, Horn {
    // public int x = 3;
    public void applybrake(int decrement) {
        System.out.println("Applying brake");
    }

    public void speedup(int increment) {
        System.out.println("Speeding up");
    }

    public void blowhorn() {
        System.out.println("Blowing Horn");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Avon A = new Avon();
        // Bicycle b = new Bicycle();             // Gives error - Mentioned Above
        A.applybrake(1);
        System.out.println(A.a);
        System.out.println(A.x);
        // A.a = 0;                               // Gives error - Mentioned above
        A.blowhorn();
    }
}



// Why java discontinued Multiple Inheritance and used interfaces: 
/*
    - There are some class that we don't want to inherit but use their features
*/
