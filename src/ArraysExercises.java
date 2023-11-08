public class ArraysExercises {
    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public static Person[] addPerson(Person[] people, Person newPerson) {
            Person[] newPeople = new Person[people.length + 1];
            System.arraycopy(people, 0, newPeople, 0, people.length);
            newPeople[people.length] = newPerson;
            return newPeople;
        }
    }

        public static void main(String[] args) {
            Person[] people = new Person[3];

            people[0] = new Person("Abe");
            people[1] = new Person("Seth");
            people[2] = new Person("Anna");

            people = Person.addPerson(people, new Person("Anthony"));


            for (Person person : people) {
                System.out.println(person.getName());
            }
        }



}
