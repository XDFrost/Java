//  Abstract: Existant only in thought


// Abstract Method: A method declared without implementation/defination
/* Ex:    
    abstract void moveto(double x, double y) 
*/
// Abstract method doesn't have a body


// Abstract class is a class that includes abstract methods 
// May also include non-abstract methods
// Abstract class is used to fix the methods that must be defined in the child class
/* Ex:

    pubic abstract class Phone {
        abstarct method
    }
    
*/
// Object of abstract class can't be made
// If we don't want to define abstract methods in child class, we can make child class abstract

// An object of sub-class can be created with reference to super class


/*

        Super class                              Abstract class A                          Declares the methods that should be present in child classes
                                                 {
                                                    abstract void method1();
                                                    abstract void method2();
                                                 }
                                
                                                        ↓
        
        Sub class                                public class C extends A                   Contains the methods of parent abstract class
                                                 {
                                                    public void method1() {
                                                        code
                                                    }

                                                    public void method2() {
                                                        code
                                                    }
                                                 }

*/



// class Basen {
//     public Basen() {
//         System.out.println("I am constructor of Basen class");
//     }

//     public void sayHello() {
//         System.out.println("Hello");
//     }

//     abstract public void greet() { }                     // Gives error because defined in non abstract class
// }


abstract class Basen {
    public Basen() {
        System.out.println("I am constructor of Basen class");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();       
    abstract public void greet2();       
}


class childn extends Basen {
    @Override
    public void greet() {
        System.out.println("Good Morning 1");
    }

    @Override
    public void greet2() {
        System.out.println("Good Morning 2");
    }
}


abstract class child3 extends Basen {

}


public class Abstract_classes {
    public static void main(String[] args) {
        // Basen b = new Basen();            // Gives error because basen is abstract class
        //child3 c1 = new child3();            // Gives error because basen is abstract class
        childn c = new childn();
        c.greet();
        Basen c1 = new childn();               // Object of sub-class with reference of super class
        c1.greet2();
    }
}
