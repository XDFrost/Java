public class precedence_associativity {
    public static void main(String[] args) {
        float a = 6*5-34/2f;
        float b = 60/5-34*2f;
        /*  
            Precedence of *  and / are same, so associativity is checked, which is from left to right in their case
        */
        System.out.println(a);
        System.out.println(b);
    }
}
