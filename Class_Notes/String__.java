package Class_Notes;

class person {
    private String name; 
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String valueof() {
        return "Name: " + name + "\nAge: "+ age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: "+ age;
    }
}

public class String__ {
    public static void main(String[] args) {
        person p = new person("Aman", 21);
        System.out.println(p);
        // System.out.println(p.valueof());
    }
}
