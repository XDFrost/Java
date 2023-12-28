// Method Overloading  =>  2 or more methods can have same method name but different parameters
// How to perform:
    // Changing methods parameters
// Changing the return type won't perform method overloading
    

public class MethodOverloading {
    static void foo() {
        System.out.println("Foo method");
    }

    static void foo(int a) {
        System.out.println("2nd Foo method: " + a);
    }

    static void foo(int a, int b) {
        System.out.println("3rd Foo method: " + a + " " + b);
    }
    public static void main(String[] args) {
        foo();
        foo(1);
        foo(2,3);
    } 
}
