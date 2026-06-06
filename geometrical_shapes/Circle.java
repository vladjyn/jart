package geometrical_shapes;

import java.awt.Color;

public class Circle implements Drawable {
    // Attributs
    private Point center;
    private int radius;
    private Color color;

    // Constructeur
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255));
    }

    // Getters & setters
    public Point getCenter() {
        return this.center;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Méthodes
    public static Circle random(int width, int height) {
        Point center = Point.random(width, height);
        int radius = (int) (Math.random() * width / 10);
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        double step = 1.0 / radius;
        for (double angle = 0; angle < 2 * Math.PI; angle += step) {
            int x = (int) (center.getX() + radius * Math.cos(angle));
            int y = (int) (center.getY() + radius * Math.sin(angle));
            displayable.display(x, y, color);
        }
    }

}
