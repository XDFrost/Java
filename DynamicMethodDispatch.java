// Used in runtime polymorphism
/* Syntax:
            super obj = new sub()          Making obj of sub class with refernce of super
*/
// If any method overrides, the method of sub class will run
// vice versa is not allowed

// Only methods defined in super class will run by this practice, BUT if there's a override method in sub class, the override method of sub class will run



class one {
    public void name() {
        System.out.println("My name is class one");
    }

    public void greet() {
        System.out.println("Hello from class one");
    }
}


class two extends one {
    @Override
    public void name() {
        System.out.println("My name is class two");
    }

    public void greet2() {
        System.out.println("Hello from class two");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // one obj = new one();
        // obj.name();

        one obj = new two();                  // Making the object of class two but with the refernce of class one; Since object is of class two name method of class two runs not one
        obj.greet();
        obj.name();
        // obj.greet2();                     // Not allowed because this method is not defined in super class
    }
}
