package shapes;
import util.Input;

public class CircleApp {
    private static int totalCircles = 0;

    public static void main(String[] args) {
        Input input = new Input();
        boolean continueCreating = true;

        do {
            System.out.println("Enter the radius of the circle:");
            double radius = input.getDouble();

            Circle circle = new Circle(radius);
            totalCircles++;

            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("Area: " + circle.getArea());

            System.out.println("Total number of circles created: " + totalCircles);
            System.out.println("Would you like to create another circle? (yes/no)");
            continueCreating = input.yesNo();
        } while (continueCreating);


    }


}
