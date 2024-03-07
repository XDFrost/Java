package Class_Notes;

class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access

    void set_c(int val) {
        this.c = val;
    }

    int print_c() {
        return c;
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.a = 10;
        obj.b = 20;
        // obj.c = 30; // Error: c has private access in Test
        obj.set_c(30);

        System.out.println(obj.a + " " + obj.b + " " + obj.print_c());
    }
}
