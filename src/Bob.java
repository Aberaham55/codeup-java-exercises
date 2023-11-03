import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ask bob a question");
        String input = scanner.nextLine();

        if (input.endsWith("?")) {
            System.out.println("sure");
        } else if (input.endsWith("!")) {
            System.out.println("wow, chill out!");
        } else if (input.isEmpty()) {
            System.out.println("fine be that way");
        } else {
            System.out.println("whatever");
        }

    }
        }



