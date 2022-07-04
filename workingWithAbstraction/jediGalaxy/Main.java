package workingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readPositions(scanner.nextLine());
        int[][] galaxy = new Galaxy(dimensions).fillTheGalaxy();

        String command = scanner.nextLine();
        long starsCollected = 0;
        while (!command.equals("Let the Force be with you")) {
            Jedi jedi = new Jedi(readPositions(command));
            Evil evil = new Evil(readPositions(scanner.nextLine()));

            int evilsRows = evil.getCurrentRow();
            int evilsCols = evil.getCurrentCol();

            Evil.MoveEvil(galaxy, evilsRows, evilsCols);

            int jediSRows = jedi.getCurrentRow();
            int jediSCols = jedi.getCurrentCol();

            starsCollected += jedi.MoveJedi(galaxy, jediSRows, jediSCols);
            command = scanner.nextLine();
        }
        System.out.println(starsCollected);

    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}