package giuseppeperna.U5_W1_D3.entities;

public abstract class Item {

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }
}
