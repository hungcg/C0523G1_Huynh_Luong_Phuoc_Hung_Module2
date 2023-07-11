package ss07_abstraction.practice.Animal;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: chick-ka-chick-ka bow-wow";
    }
    public String howToEat() {
        return "could be fried";
    }
}