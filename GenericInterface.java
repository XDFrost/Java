interface minmax<T extends Comparable<T>>{
    T min();
    T max();
}

class Myclass<T extends Comparable <T>> implements minmax<T> {

    T[] vars;
    Myclass(T[] o) {
        vars = o;
    }
    
    public T min() {
        T v = vars[0];
        for(int i = 0; i<vars.length; i++) {
            if(vars[i].compareTo(v)<0) {
                v = vars[i];
            }
        }
        return v;
    }

    public T max() {
        T v = vars[0];
        for(int i = 0; i<vars.length; i++) {
            if(vars[i].compareTo(v)>0) {
                v = vars[i];
            }
        }
        return v;
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        Integer inums[] = {4,8,12,16,20};
        Character chars[] = {'a', 'b', 'i', 'j', 'k'};

        Myclass<Integer> iob = new Myclass<Integer>(inums);
        System.out.println(iob.min());
        System.out.println(iob.max());

        Myclass<Character> cob = new Myclass<Character>(chars);
        System.out.println(cob.min());
        System.out.println(cob.max());
    }
}
