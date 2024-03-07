package Class_Notes;


// Static keyword is used to create variables and methods that will exist independently of any instance created for the class.
// Static members are initialized before the class is initialized.
// Static members can be called without making a class object.
// main function is a entry point in java


// Restriction on static functions:
// 1. Static functions can only call other static functions
// 2. Static functions can only access static data
// 3. Static functions cannot use this or super keywords



class static_ {
    static void speak() {
        System.out.println("Static function");
    }
}

class non_static {
    public void speak() {
        System.out.println("Non Static fuction");
    }
}


public class static_fun {
    static int returnnum() {
        return 8;
    }
    public static void main(String[] args) {
        // Calling static functions
        System.out.println(returnnum());
        static_.speak();
        
        // Calling non-static functions
        non_static obj = new non_static();
        obj.speak();
    }
}
