// Borrows properties and methods from existing class
/*Ex:
        BASE CLASS                       class parent
             ↓ 
        DERIVED CLASS                    class name extends parent
*/
// 'extends' keyword is used to declare inheritance
// If base is changed, derived class also reflects those changes

// No multiple inheritance i.e. there can be only one super class/base class



class base1 {                                       // Base class
    int x;

    public int getx() {
        return x;
    }

    public void setx( int x) {
        this.x = x;
    }
}

class derived1 extends base1 {                       // Derived Class

}

class Animal {
    String n;
    public void setname(String s) {
        this.n = s;
    }

    public String getname() {
        return n;
    }
}

class Dog extends Animal{

}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("BASE CLASS");
        base1 b = new base1();
        b.setx(4);
        System.out.println(b.getx());
        
        System.out.println("DERIVED CLASS");
        derived1 d = new derived1();
        d.setx(99);
        System.out.println(d.getx());

        System.out.println("Animal class");
        Animal a = new Animal();
        a.setname("Animal");
        System.out.println(a.getname());

        System.out.println("Dog class");
        Dog dg = new Dog();
        dg.setname("Dog");
        System.out.println(dg.getname());
    }
}
