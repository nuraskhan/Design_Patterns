package Assignments.Assignment_6.Decorater;

public class PizzaDecorater implements Eatable{
    private Eatable pizza;

    public PizzaDecorater(Eatable pizza) {
        this.pizza = pizza;
    }
    @Override
    public int get_price() {
        return pizza.get_price();
    }
}
