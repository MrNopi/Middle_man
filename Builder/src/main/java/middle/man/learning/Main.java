package middle.man.learning;

import middle.man.learning.entity.animals.Animal;
import middle.man.learning.entity.animals.Cat;
import middle.man.learning.entity.animals.Dog;
import middle.man.learning.entity.Person;

import java.util.Comparator;
import java.util.List;

public class Main {

    private static final String PREDETERMINED_CITY = "Lviv";

    private static final Person.PersonBuilder builder = new Person.PersonBuilder();

    private static final List<Person> people = List.of(
            builder.setName("Ivan").setCity("Lviv").setAge(37).build(),
            builder.setName("Maria").setCity("Lviv").setAge(22).build(),
            builder.setName("Andrew").setCity("Lviv").setAge(24).build(),
            builder.setName("Serhii").setCity("Lviv").setAge(55).build(),
            builder.setName("Svitlana").setCity("Lviv").setAge(44).build(),
            builder.setName("Volodymyr").setCity("Kyiv").setAge(37).build(),
            builder.setName("Ashot").setCity("Cherkasy").setAge(39).build(),
            builder.setName("Maxim").setCity("Odessa").setAge(43).build(),
            builder.setName("Ellie").setCity("New York").setAge(77).build(),
            builder.setName("Dmitrii").setCity("Washington").setAge(26).build()
    );


    private static final List<Animal> animals = List.of(
            new Cat(),
            new Dog(),
            new Cat(),
            new Dog()
    );

    public static void main(String[] args) {
        people.stream()
                .filter(x -> x.getCity().equalsIgnoreCase(PREDETERMINED_CITY))
                .filter(x -> x.getAge() > 25)
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(System.out::println);

        animals.forEach(Animal::speak);
    }
}