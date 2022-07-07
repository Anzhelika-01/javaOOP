package encapsulation.pizzaCalories;

import java.util.Arrays;

public class Dough {
    private FlourTypes flourType;
    private BakingTechniques bakingTechnique;
    private double weight;
    String message = "Invalid type of dough.";

    Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException
                    ("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if (Arrays.stream(FlourTypes.values())
                .anyMatch(t -> t.name().equals(flourType))) {
            this.flourType = FlourTypes.valueOf(flourType);
        } else {
            throw new IllegalArgumentException(message);
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (Arrays.stream(BakingTechniques.values())
                .anyMatch(t -> t.name().equals(bakingTechnique))) {
            this.bakingTechnique = BakingTechniques.valueOf(bakingTechnique);
        } else {
            throw new IllegalArgumentException(message);
        }
    }

    public double calculateCalories() {
        double total = (weight * 2) *
                bakingTechnique.getBackingTechniqueCalories() *
                flourType.getFlourCalories();
        return total;
    }
}