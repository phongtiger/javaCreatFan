public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed_,int radius_, String color_, boolean on_) {
        speed = speed_;
        radius = radius_;
        color = color_;
        on = on_;
    }

    public void statusFan() {
        if (isOn()) {
            System.out.println("Fan is on:");
            System.out.println("Status of fan: speed " + speed + " radius " + radius + " color " +color);
        } else {
            System.out.println("Fan is off:");
            System.out.println("Radius "+ radius+" color "+color);
        }
    }
}

