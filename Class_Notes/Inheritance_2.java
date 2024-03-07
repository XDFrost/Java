package Class_Notes;


class weighted_box {
    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }

    void setDim(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void setDim(double val) {
        width = height = depth = val;
    }



    //  CONSTRUCTOR
    weighted_box(int w, int h, int d) {
        System.out.println("Constructing Box");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    weighted_box(int val) {
        width = height = depth = val;
    }
}


class new_weight extends weighted_box{
    double weight;

    new_weight(int w, int h, int d, int wi) {
        super(w, h, d);
        weight = wi;
        System.out.println("Weight is: " + weight);
    }

    double volume() {
        System.out.println("WEIGHTED VOLUME: ");
        return (super.volume() + weight);
    }
}


public class Inheritance_2 {
    public static void main(String[] args) {
        new_weight obj = new new_weight(1, 2, 3, 4);
        System.out.println(obj.volume());
    }
}
