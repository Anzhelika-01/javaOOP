package encapsulation.pizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaType = scanner.nextLine().split("\\s+");
        String name = pizzaType[1];
        int numberOfToppings = Integer.parseInt(pizzaType[2]);

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String type = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        int weight = Integer.parseInt(doughInfo[3]);

        try {
            Pizza pizza = new Pizza(name, numberOfToppings);
            Dough dough = new Dough(type, bakingTechnique, weight);
            pizza.setDough(dough);

            String command = scanner.nextLine();

            while (!command.equals("END")) {
                String[] toppingInfo = command.split("\\s+");
                String toppingType = toppingInfo[1];
                int toppingWeight = Integer.parseInt(toppingInfo[2]);
                Topping topping = new Topping(toppingType, toppingWeight);

                pizza.addTopping(topping);
                command = scanner.nextLine();
            }
            System.out.println(pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}