package Assignments.Assignment_6.Decorater;

public class Pizza implements Eatable {
    int price;

    public Pizza() {
        this.price = 1500;
    }

    @Override
    public int get_price() {
        return this.price;
    }
}
