// Types:   
        // 1. Public
        // 2. Private
        // 3. Protected

// Specifies where a method/property is accessible
// public by default

// Private modifiers can only be accessed inside same class



class Emp {
    private
        int id;
        String name;
    
    public void set_name(String n) {
        this.name = n;
    }

    public String get_name() {
        return name;
    }

    public void set_id(int i) {
        this.id = i;
    }

    public int get_id() {
        return id;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Emp Frost = new Emp();

        Frost.set_name("Frost");
        Frost.set_id(1);
        System.out.println(Frost.get_name());
        System.out.println(Frost.get_id());
    }
}
