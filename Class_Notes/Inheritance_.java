package Class_Notes;


class x {
    int i = 1;
    int j = 2;
    // private int j = 2;
    
    void showij() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

class y extends x {
    int k = 3;
    public void showijk() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

    public void sum() {
        System.out.println("SUM: " + (i+j+k));
    }
}

public class Inheritance_ {
    public static void main(String[] args) {
        x obj = new x();
        obj.showij();

        System.out.println();

        y obj2 = new y();
        obj2.showijk();
        obj2.sum();
        
        System.out.println();

        obj2.i = 10;
        obj2.j = 11;
        obj2.k = 12;
        
        obj2.showijk();
        obj2.sum();
    }
}
