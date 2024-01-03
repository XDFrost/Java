// Only interfaces can extend each other
/*
    Ex:

        interface A {                                  // Parent interface
            methods
        }

        interface B extends A {                        // Child Interface
            methods
        }
*/

// If we are implementing an child interface in class, the class should define the methods
// of both parent and child interfaces
/*
    Ex:
        
        interface A {
            void method_1();
        }
        
        interface B extends A {
            void method_2();
        }

        class C implements B {
            void method_1 {
                body
            }

            void method_2 {
                body
            }
        }
*/



interface sample {
    void meth1();
    void meth2();
}


interface child_sample extends sample{
    void meth3();
    void meth4();
}


// class child_sample_1 extends sample{ }                            // Gives error because class is trying to extend/inherit an interface


class SampleClass implements child_sample{
    public void meth1() {
        System.out.println("Meth 1");
    }
    
    public void meth2() {
        System.out.println("Meth 2");
    }
    
    public void meth3() {
        System.out.println("Meth 3");
    }
    
    public void meth4() {
        System.out.println("Meth 4");
    }
}


public class Interface_Inheritance {
    public static void main(String[] args) {
        SampleClass sc = new SampleClass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
