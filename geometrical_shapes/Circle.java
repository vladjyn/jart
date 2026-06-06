package jart.geometrical_shapes;

public class Circle implements Drawable {
    // Attributs
    private Point center;
    private int radius;
    private Color color;

    // Constructeurs
    public Circle() {
        this.center = new Point(0, 0);
        this.radius = 1;
    }

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Setters
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Getters
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

    // Fonctions
    public static Circle random(int width, int height) {
    Point center = Point.random(width, height);
    int radius = (int) (Math.random() * width / 10);
    return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        for (double angle = 0; angle < 2 * Math.PI; angle += 0.001) {
        int x = (int) (center.getX() + radius * Math.cos(angle));
        int y = (int) (center.getY() + radius * Math.sin(angle));
        displayable.display(x, y, color);
    }
    }

    
}
