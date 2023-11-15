package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        Student student1 = new Student("Abe");
        student1.addGrade(100);
        student1.addGrade(75);
        student1.addGrade(50);
        students.put("Abe@gmail", student1);

        Student student2 = new Student("Seth");
        student2.addGrade(100);
        student2.addGrade(75);
        student2.addGrade(50);
        students.put("Seth@gmail", student2);

        Student student3 = new Student("Anthony");
        student3.addGrade(100);
        student3.addGrade(75);
        student3.addGrade(100);
        students.put("Anthony@gmail", student3);

        Scanner scanner = new Scanner(System.in);
        String continuePrompt = "y";
        System.out.println();

        System.out.println("Welcome! Here are the  usernames of our students:\n" + students.keySet());

        while (continuePrompt.equalsIgnoreCase("y")) {
            System.out.println("What student would you like to see more information on?");
            String username = scanner.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("Name: " + student.getName() + " -  Username: " + username);
                System.out.println("Current Average: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the username of \"" + username + "\".");
            }

            System.out.println("\nWould you like to see another student?");
            continuePrompt = scanner.nextLine();
        }

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
