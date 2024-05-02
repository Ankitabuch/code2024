package Assignment.Interface.Animal;

public class Penguin implements Animal, Swimmable {

    public void feed() {
        System.out.println("Feeding on fish");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin Makes Sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can Swim");
    }
}
