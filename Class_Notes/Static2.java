package Class_Notes;


class staticEx {
    static int a = 30;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    static {                                            // Static block; Anything in it will run at run-time; Will run first no matter what
    System.out.println("Static Block");
        b = a + 2;
    }
// }

// public class Static2 {
    public static void main(String[] args) {
        meth(10);

        // staticEx.meth(10);
    }
}
