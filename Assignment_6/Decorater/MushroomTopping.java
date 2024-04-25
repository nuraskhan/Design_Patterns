package Assignments.Assignment_6.Decorater;

public class MushroomTopping extends PizzaDecorater{
    private int TOPPING_PRICE = 150;

    public MushroomTopping(Eatable pizza) {
        super(pizza);
    }

    @Override
    public int get_price() {
        return super.get_price() + TOPPING_PRICE;
    }
}
