package giuseppeperna.U5_W1_D3.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends Item {

    private String name;
    private List<Topping> toppingList;
    private boolean isXl = false;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(700, 4.3);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + this.toppingList.stream().mapToInt(Topping::getCalories).sum();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.toppingList.stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + getCalories() +
                ", price=" + getPrice() +
                ", toppingList=" + toppingList +
                ", isXl=" + isXl +
                '}';
    }
}
