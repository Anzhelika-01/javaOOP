package encapsulation.shoppingSpree;

public class Product {
    private String name;
    private double cost;

    Product(String name, double cost){
        setName(name);
        setCost(cost);
    }

    public void setName(String name) {
        Person.IsItEmpty(name);
        this.name = name;
    }

    public void setCost(double cost) {
        Person.IsItPositive(cost);
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}