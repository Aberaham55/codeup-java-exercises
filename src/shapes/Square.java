package shapes;

public class Square extends Rectangle{
    private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
//    public double getArea () {
//return side ^ 2;
//    }
//    public double getPerimeter () {
//        return 4 * side;
//    }

    @Override
    public double getArea() {
//        return super.getArea();
        System.out.println("hi mom");
        return side * side;

    }

    @Override
    public double getPerimeter() {
//        return super.getPerimeter();
        System.out.println("hi dad");
        return 4 * side;
    }
}
