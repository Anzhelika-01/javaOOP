package encapsulation.pizzaCalories;

import java.util.Arrays;

public class Topping {
    private ToppingTypes toppingType;
    private double weight;

    Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException
                    (this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        if (Arrays.stream(ToppingTypes.values())
                .anyMatch(t -> t.name().equals(toppingType))) {
            this.toppingType = ToppingTypes.valueOf(toppingType);
        } else {
            throw new IllegalArgumentException
                    ("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    public double calculateCalories() {
        double total = (2 * weight) * toppingType.getToppingCalories();
        return total;
    }
}