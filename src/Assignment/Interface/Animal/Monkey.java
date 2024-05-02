package Assignment.Interface.Animal;

public class Monkey implements Animal, Climbable {

    public void feed() {
        System.out.println("Feeding on fruits");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey chattering");
    }

    @Override
    public void climb() {
        System.out.println("Monkey climbing a tree");
    }
}
