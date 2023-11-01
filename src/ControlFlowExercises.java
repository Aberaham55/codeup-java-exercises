import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuePrompt = "y";

        do {
            System.out.println("Enter a numerical grade from 0 to 100:");
            int grade = scanner.nextInt();

            if (grade >= 99) {
                System.out.println("Your grade is A+");
            } else if (grade >= 88) {
                System.out.println("Your grade is A");
            } else if (grade >= 86) {
                System.out.println("Your grade is B+");
            } else if (grade >= 80) {
                System.out.println("Your grade is B");
            } else if (grade >= 78 ){
                System.out.println("Your grade is C+");
            } else if (grade >= 67) {
                System.out.println("your grade is C");
            } else
                System.out.println("You failed");

            System.out.println("Do you want to continue? (y/n)");
            continuePrompt = scanner.next();
        } while (continuePrompt.equalsIgnoreCase("y"));

//        System.out.println("What number would you like to go up to?");
//        int number = scanner.nextInt();
//
//        System.out.println("\nHere is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= number; i++) {
//            int square = i * i;
//            int cube = i * i * i;
//            System.out.printf("%-5d | %-7d | %-5d\n", i, square, cube);
//        }
//    }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        int result = 2;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(result);
//            result *= result;


//        int i = 5;
//        while (i <= 15) {
////            System.out.println(i);
//            i++;
//        }
//        int count = 0;
//        do {
////            System.out.println(count);
//            count += 2;
//        } while (count <= 100);
//        int count2 = 100;
//        do {
////            System.out.println(count2);
//            count2 -= 5;
//        } while (count2 >= -10);
//
//        }
    }
}

