package Class_Notes;


// Refers the current obj


class BOX___ {
    int num;
    BOX___(int num) {
        // num = num;               // Will give 0 as num in object because of ambiguity (SAME NAME)
        this.num = num;
        System.out.println("Value of num is: " + num);
    }
}

public class this_ {
    public static void main(String[] args) {
        BOX___ obj = new BOX___(10);
        System.out.println(obj.num);
    }
}
