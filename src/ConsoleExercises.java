import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Width");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter height");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.printf("length:"+ length + "%n"+"width:"+ width +"%n"+"Height"+height, length, width,height );
        int area = length * width * height;
        System.out.printf("%n"+"The area of classroom is,"+ area);






        //        String cohort = "Hippo";
//        byte weeks = 9;
//        double completionPercentage = 38.7525;
//        System.out.printf("Hello, %s,%n welcome to week %d!!!%n you are %.4f%% of the way through.%n", cohort, weeks, completionPercentage);
//        System.out.println("Is this a new line?");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
//        System.out.printf("Hello %s," + " ", userInput);
//        System.out.println("how old are you?");
//        int userNumber = Integer.parseInt(scanner.nextLine());
////        String ageInput = scanner.nextLine();
//        System.out.printf(userInput + " " + "is, %d", userNumber);
////        System.out.println("enter a number:");




//    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);
//    }
        }
    }
