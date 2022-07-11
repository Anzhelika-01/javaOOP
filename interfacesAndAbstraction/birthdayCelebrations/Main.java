package interfacesAndAbstraction.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split("\\s+");
        List<Birthable> dates = new ArrayList<>();

        while (!line[0].equals("End")) {
            switch (line[0]) {
                case "Citizen":
                    String name = line[1];
                    int age = Integer.parseInt(line[2]);
                    String id = line[3];
                    String birthDate = line[4];
                    Birthable citizen = new Citizen(name, age, id, birthDate);
                    dates.add(citizen);
                    break;
                case "Pet":
                    name = line[1];
                    birthDate = line[2];
                    Birthable pet = new Pet(name, birthDate);
                    dates.add(pet);
                    break;
                case "Robot":
                    String model = line[1];
                    id = line[2];
                    Robot robot = new Robot(id, model);
                    break;
            }
            line = scanner.nextLine().split("\\s+");
        }

        String year = scanner.nextLine();
        for (Birthable date : dates){
            if (date.getBirthDate().endsWith(year)){
                System.out.println(date.getBirthDate());
            }
        }
    }
}