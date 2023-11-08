import java.util.Random;


public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"happy", "sad", "angry", "excited", "calm", "nervous", "confident", "shy", "proud", "anxious"};
        String [] nouns = { "dog", "cat", "bird", "fish", "car", "house", "tree", "flower", "book", "pen"};
        System.out.println("your server name is: " + returnRandomElement(adjectives) + "-" + returnRandomElement(nouns));

    }
public static String returnRandomElement(String[] array) {
        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
    return array[randomIndex];

}
}