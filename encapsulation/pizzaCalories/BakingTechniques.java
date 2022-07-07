package encapsulation.pizzaCalories;

public enum BakingTechniques {
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);

    private final double bakingCalories;
    BakingTechniques(double calories) {
        this.bakingCalories = calories;
    }

    public double getBackingTechniqueCalories(){
        return bakingCalories;
    }
}