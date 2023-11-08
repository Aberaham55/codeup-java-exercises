package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Square square = new Square(4);
        double area = square.getArea();
        System.out.println("area: " + area);
        double perimeter = square.getPerimeter();
        System.out.println("perimeter: " + perimeter);
        //box1
        Rectangle box1 = new Rectangle(4, 5);
        double areaBox1 = box1.getArea();
        System.out.println("box1 area = " + areaBox1);
        double perimeterBox1 = box1.getPerimeter();
        System.out.println("box 1 perimeter = " + perimeterBox1);
        //box2
        Rectangle box2 = new Square(5);
        double areaBox2 = box2.getArea();
        System.out.println("box2 area = " + areaBox2);
        double perimeterBox2 = box2.getPerimeter();
        System.out.println("box2 Perimeter = " + perimeterBox2);
    }
}
