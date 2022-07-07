package encapsulation.pizzaCalories;

public enum FlourTypes {
    White(1.5),
    Wholegrain(1.0);

    private final double flourCalories;

    FlourTypes(double calories) {
        this.flourCalories = calories;
    }

    public double getFlourCalories() {
        return flourCalories;
    }
}