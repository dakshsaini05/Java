package Revision;

public class Car {
    private String color;
    private int speed;

    // setter to set the value of color and speed
    public void setColor(String color) {
        if(color != null && !color.isEmpty()) {
            this.color = color;
        }
    }

    public void setSpeed(int speed) {
        if(speed > 0) {
            this.speed = speed;
        }
    }

    // getter to read the values
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
}
