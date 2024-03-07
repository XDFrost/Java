// Mechanism by which call to a overridden method is resolved at runtime rather than compile time
// Used in runtime polymorphism
// Allows a refernce variable of a super class type to refer to an object of subclass type

// When a method is called on this refernce variable, the actual method that gets executed is determined at run time based on type of obj to which reference var points

// class obj_name = new reference()


package Class_Notes;

class p {
    void display () {
        System.out.println("Inside PARENT");
    }
}

class sub extends p {
    void display() {
        System.out.println("Inside SUBCLASS");
    }
}

class sub2 extends p {
    void display() {
        System.out.println("Inside SUBCLASS 2");
    }
}

public class DynamicMethodDispatchClass {
    public static void main(String[] args) {
        p obj1 = new P();
        sub obj2 = new sub();
        sub2 obj3 = new sub2();

        p x = new sub();

        x.display();
    }   
}
