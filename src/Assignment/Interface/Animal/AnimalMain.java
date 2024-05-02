package Assignment.Interface.Animal;

public class AnimalMain {
    public static void main(String[] args){
        Lion lion = new Lion();
        Penguin penguin = new Penguin();
        Monkey monkey = new Monkey();

        System.out.println("Lion:");
        lion.feed();
        lion.makeSound();
        lion.climb();
        System.out.println();

        System.out.println("Penguin:");
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
        System.out.println();

        System.out.println("Monkey:");
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
    }
}
