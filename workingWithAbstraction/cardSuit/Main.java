package workingWithAbstraction.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Card Suits: ");

        for (Card card : Card.values()){
            System.out.println("Ordinal value: " +
                    card.ordinal() + "; Name value: " + card.name());
        }
    }
}