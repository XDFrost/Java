class NonGen {
    Object obj;
    NonGen(Object o) {
        obj = o;
    }

    Object getData() {
        return obj;
    }

    void ShowType() {
        System.out.println("Type is: " + obj.getClass().getName());
    }
}

public class NonGeneric {
    public static void main(String[] args) {
        NonGen iob = new NonGen(78);
        iob.ShowType();
        Object i = iob.getData();
        System.out.println("Type of i is: " + i.getClass().getName());
        System.out.println("Value: " + i);
        iob.ShowType();

        System.out.println();

        NonGen sob = new NonGen("Hello");
        sob.ShowType();
        Object j = sob.getData();
        System.out.println("Type of j is: " + j.getClass().getName());
        System.out.println("Value: " + j);
        sob.ShowType();

        iob = sob;              // Doesn't give error because of type object
        // int value = (Integer) iob.getData();                 // Gives error because iob is/ now of type string not integer
    }
}
