package inheritance.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        List<Animal> animalList = new ArrayList<>();

        while (!animal.equals("Beast!")) {
            String command = scanner.nextLine();
            String[] animalInfo = command.split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animal) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animalList.add(cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animalList.add(frog);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animalList.add(dog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        animalList.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        animalList.add(tomcat);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            animal = scanner.nextLine();
        }
        animalList.forEach(System.out::println);
    }
}