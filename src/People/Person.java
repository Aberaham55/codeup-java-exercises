package People;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        setName("Abe");
        System.out.printf("%s says Hello", getName());
    }

    public static void main(String[] args) {
        Person person = new Person("Abe");
        person.sayHello();
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
