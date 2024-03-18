class Gen2<T,V> {
    T obj1;
    V obj2;

    Gen2(T o1 , V o2) {
        obj1 = o1;
        obj2 = o2;
    }

    void ShowType() {
        System.out.println("Type of T: "+obj1.getClass().getName());
        System.out.println("Type of V: "+obj2.getClass().getName());
    }

    T getDataT() {
        return obj1;
    }

    V getDataV() {
        return obj2;
    }
}

public class Generic2 {
    public static void main(String[] args) {
        Gen2<Integer, String> istrob = new Gen2<Integer, String> (78, "Hello");
        istrob.ShowType();
        int a = istrob.getDataT();
        System.out.println("Data: " + a);
        String b = istrob.getDataV();
        System.out.println("Data: " + b);
    }
}
