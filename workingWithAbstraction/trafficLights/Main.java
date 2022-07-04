package workingWithAbstraction.trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colors = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            Color currentColor = Color.valueOf(color);
            TrafficLight currentTrafficLight = new TrafficLight(currentColor);
            trafficLights.add(currentTrafficLight);
        }
        for (int i = 0; i < count; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();
        }
    }
}