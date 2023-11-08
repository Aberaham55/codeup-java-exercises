package movies;

public class Movie {
    private String name;
    private String category;

   //constructor//
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    //getter and setter//
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory() {
        this.category = category;
    }
}