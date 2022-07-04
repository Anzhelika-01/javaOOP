package workingWithAbstraction.trafficLights;

public class TrafficLight {

    private Color currentColor;

    TrafficLight(Color color) {
        this.currentColor = color;
    }

    public Color getCurrentColor() {
        switch (currentColor) {
            case RED:
                currentColor = Color.GREEN;
                break;
            case YELLOW:
                currentColor = Color.RED;
                break;
            case GREEN:
                currentColor = Color.YELLOW;
                break;
        }
        return currentColor;
    }
}