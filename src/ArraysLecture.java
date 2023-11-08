import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        //Declare an array that holds 5 ints//
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 35;
        numbers[2] = 45;
        numbers[3] = 55;
        numbers[4] = 65;
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

        //Array initializer syntax//
        String[] myStrings = {
                "random", "word", "repo", "idea", "yo"};

        //looping over arrays//
        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);
        }
        //enhanced for loop//
        for (String string: myStrings){
            System.out.println(string);
        }

    }


}
