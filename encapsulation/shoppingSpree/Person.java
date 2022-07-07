package encapsulation.shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        IsItEmpty(name);
        this.name = name;
    }

    private void setMoney(double money) {
        IsItPositive(money);
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (money < product.getCost()) {
            throw new IllegalArgumentException
                    (this.name + " can't afford " + product.getName());
        }
        products.add(product);
        System.out.println(name + " bought " + product.getName());
        money = money - product.getCost();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" - ");

        String productData = products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));
        if (productData.isEmpty()) {
            stringBuilder.append("Nothing bought");
        } else {
            stringBuilder.append(productData);
        }
        return stringBuilder.toString();
    }

    public static void IsItPositive(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public static void IsItEmpty(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }
}