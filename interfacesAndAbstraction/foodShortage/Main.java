package interfacesAndAbstraction.foodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
//        Map<Citizen, Integer> citizens = new LinkedHashMap<>();
//        Map<String,Integer> rebels = new LinkedHashMap<>();
        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] personalInfo = scanner.nextLine().split("\\s+");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            if (personalInfo.length == 4) {
                String id = personalInfo[2];
                String birthDate = personalInfo[3];
                Buyer citizen = new Citizen(name, age, id, birthDate);
                buyers.put(name, citizen);
//                citizens.put(citizen, citizen.getFood());
            } else {
                String group = personalInfo[2];
                Buyer rebel = new Rebel(name, age, group);
                buyers.put(name, rebel);
//                rebels.put(name, rebel.getFood());
            }
        }

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            Buyer buyer = buyers.get(name);

            if (buyer != null) {
                buyer.buyFood();
            }
            name = scanner.nextLine();
        }
        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}