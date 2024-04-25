package Assignments.Assignment_6.Decorater;

public class PepperoniTopping extends PizzaDecorater{
    private int TOPPING_PRICE = 200;

    public PepperoniTopping(Eatable pizza) {
        super(pizza);
    }

    @Override
    public int get_price() {
        return super.get_price() + TOPPING_PRICE;
    }
}
