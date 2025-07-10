package middle.man.learning.entity.animals;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof");
    }
}
