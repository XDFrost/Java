package Class_Notes;


class Box {
    double width;
    double height;
    double depth;

    void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return height*width*depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box obj1 = new Box();   
        obj1.setDim(10, 9, 8);
        System.out.println(obj1.volume());

        Box obj2 = new Box();
        obj2.setDim(100, 2, 3);
        System.out.println(obj2.volume());
    }
}
