package workingWithAbstraction.jediGalaxy;

public class Galaxy {
    private int[] dimensions;

    Galaxy(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public void setDimensions(int[] dimensions) {
        this.dimensions = dimensions;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int[][] fillTheGalaxy() {
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] galaxy = new int[rows][cols];
        int powerOfTheField = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = powerOfTheField++;
            }
        }
        return galaxy;
    }
}