package workingWithAbstraction.jediGalaxy;

public class Evil {
    private int[] currentPosition;
    private int currentRow;
    private int currentCol;

    Evil(int[] currentPosition) {
        this.currentPosition = currentPosition;
        setCurrentRow(currentPosition[0]);
        setCurrentCol(currentPosition[1]);
    }

    public void setCurrentPosition(int[] currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setCurrentCol(int currentCol) {
        this.currentCol = currentCol;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public static void MoveEvil(int[][] galaxy, int evilsRows, int evilsCols) {
        while (evilsRows >= 0 && evilsCols >= 0) {
            if (evilsRows < galaxy.length && evilsCols < galaxy[0].length) {
                galaxy[evilsRows][evilsCols] = 0;
            }
            evilsRows--;
            evilsCols--;
        }
    }
}