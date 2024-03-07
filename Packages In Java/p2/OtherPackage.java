package p2;

public class OtherPackage {
    
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Other Package Constructior");

        // class only 
        // System.out.println("n: " + p.n);

        // private only 
        // System.out.println("n_pri: " + p.n_pri);

        // protected
        // System.out.println("n_pro: " + p.n_pro);

        System.out.println("n_pub: " + p.n_pub);
    }

}
