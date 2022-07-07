package encapsulation.classBox;

public class Box {
    private double length, width, height;
    Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        checkForNegativeArgument(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNegativeArgument(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkForNegativeArgument(height, "Height");
        this.height = height;
    }

    public double calculateLateralSurfaceArea() {
        return (2 * this.length * this.height) + (2 * this.width * this.height);
    }

    public double calculateSurfaceArea() {
        return calculateLateralSurfaceArea()
                + (2 * this.length * this.width);
    }

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }

    private void checkForNegativeArgument(double argument, String argumentType) {
        if (argument <= 0) {
            throw new IllegalArgumentException
                    (argumentType + " cannot be zero or negative.");
        }
    }
}