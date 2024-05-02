package Assignment.Interface.Animal;

public class Lion implements Animal, Climbable {
    @Override
    public void feed() {
        System.out.println("Feeding on Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!!");
    }

    @Override
    public void climb() {
        System.out.println("Lion is Climbing");
    }
}
