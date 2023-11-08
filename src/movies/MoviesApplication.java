package movies;
import util.Input;
public class MoviesApplication {
    //put the command loop in here
    public static void main(String[] args) {
        // loop until the user chooses to exit


        //display menu

        //wait for user to choose a menu option

        //validate the choice, if no good go back to first step

        //do the choice

        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();
        for (Movie movie : movies) {
            if (input.getString == 1) {
                System.out.println("Name: " + movie.getName());
                System.out.println("Category: " + movie.getCategory());
            }
        }

    }

}
