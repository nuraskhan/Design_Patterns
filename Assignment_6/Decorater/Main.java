package Assignments.Assignment_6.Decorater;

public class Main {
    public static void main(String[] args) {
        Eatable basePizza = new Pizza();
        basePizza = new PepperoniTopping(basePizza); // Adding pepperoni topping
        basePizza = new MushroomTopping(basePizza); // Adding mushroom topping

        System.out.println("Pizza price with toppings: $" + basePizza.get_price());
    }
}
