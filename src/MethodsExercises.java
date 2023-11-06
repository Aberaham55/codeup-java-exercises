import java.util.Scanner;

public class MethodsExercises {

    // Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
    }
    public static int modulas (int num1, int num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("error");
            return 0;
        }

    }

    public static int multiplyWithoutStar (int num1, int num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 + multiply(num1, num2 - 1);
        }
    }
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;

        do {
            System.out.printf("Enter a number between " + min + " and " + max +":");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    validInput = true;
                } else {
                    System.out.println("The number is not in the range. Please try again.");
                }
            } else {
                System.out.println("That's not a number. Please try again.");
                scanner.next(); // discard non-integer input
            }
        } while (!validInput);

        return getInteger(min, max);
    }

    public static void main(String[] args) {
        int sum = MethodsExercises.add(5, 3);
        int difference = MethodsExercises.subtract(5, 3);
        int product = MethodsExercises.multiply(5, 3);
        double quotient = MethodsExercises.divide(10, 5);
        int mod = MethodsExercises.modulas(5, 3);
        int noStar = MethodsExercises.multiplyWithoutStar(5, 3);
        int range = MethodsExercises.getInteger(1, 10);

        System.out.println(range);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulas: " + mod);
        System.out.println("Product: " + noStar);
    }


    }


