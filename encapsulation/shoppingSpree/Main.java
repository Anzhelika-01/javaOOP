package encapsulation.shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> persons = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] peoples = scanner.nextLine().split(";");
        try {
            for (String p : peoples) {
                String[] peoplesInfo = p.split("=");
                String name = peoplesInfo[0];
                int money = Integer.parseInt(peoplesInfo[1]);
                Person person = new Person(name, money);
                persons.put(name, person);
            }

            String[] productsInfo = scanner.nextLine().split(";");
            for (String p : productsInfo) {
                String[] productInfo = p.split("=");
                String name = productInfo[0];
                int cost = Integer.parseInt(productInfo[1]);
                Product product = new Product(name, cost);
                products.put(name, product);
            }
            String command = scanner.nextLine();
            while (!command.equals("END")) {
                String[] purchase = command.split("\\s+");
                String personName = purchase[0];
                String productName = purchase[1];

                Person buyer = persons.get(personName);
                Product productToBuy = products.get(productName);
                buyer.buyProduct(productToBuy);
                command = scanner.nextLine();
            }
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        persons.values().forEach(System.out::println);
    }
}