package encapsulation.pizzaCalories;

public enum ToppingTypes {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private final double toppingCalories;
    ToppingTypes(double calories) {
        this.toppingCalories = calories;
    }

    public double getToppingCalories(){
        return toppingCalories;
    }
}