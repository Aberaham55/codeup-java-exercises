package util;
import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    public int getString;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equals("y");
    }

    public int getInt(int min, int max) {
        int input;
        do {
            input = scanner.nextInt();
            scanner.nextLine();
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            input = scanner.nextDouble();
            scanner.nextLine();
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}

