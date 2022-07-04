package workingWithAbstraction.jediGalaxy;

public class Jedi {

    private int[] currentPosition;
    private int currentRow;
    private int currentCol;

    Jedi(int[] currentPosition) {
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

    public long MoveJedi(int[][] galaxy, int jediSRows, int jediSCols) {
        long starsCollected = 0;
        while (jediSRows >= 0 && jediSCols < galaxy[1].length) {
            if (jediSRows < galaxy.length
                    && jediSCols >= 0 && jediSCols < galaxy[0].length) {
                starsCollected += galaxy[jediSRows][jediSCols];
            }
            jediSCols++;
            jediSRows--;
        }
        return starsCollected;
    }
}