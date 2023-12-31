package util;



public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string:");
        String stringInput = input.getString();

        System.out.println("Enter a boolean (yes/no):");
        boolean yesNoInput = input.yesNo();

        System.out.println("Enter an integer between 1 and 10:");
        int intInput = input.getInt(1, 10);

        System.out.println("Enter a double between 4.5 and 9.6:");
        double doubleInput = input.getDouble(4.5, 9.4);

        System.out.println("String input: " + stringInput);
        System.out.println("Yes/No input: " + yesNoInput);
        System.out.println("Integer input: " + intInput);
        System.out.println("Double input: " + doubleInput);
    }
}
