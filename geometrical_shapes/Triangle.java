package jart.geometrical_shapes;

public class Triangle implements Drawable {
    // Attributs
    private Point top;
    private Point left;
    private Point right;
    private Color color;

    // Constructeurs
    public Triangle() {
        this.top = new Point(0, 0);
        this.left = new Point(1, 1);
        this.right = new Point(2, 2);
    }

    public Triangle(Point top, Point left, Point right) {
        this.top = top;
        this.left = left;
        this.right = right;
    }

    // Setters
    public void setTop(Point top) {
        this.top = top;
    }

    public void setLeft(Point left) {
        this.left = left;
    }

    public void setRight(Point right) {
        this.right = right;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Getters
    public Point getTop() {
        return this.top;
    }

    public Point getLeft() {
        return this.left;
    }

    public Point getRight() {
        return this.right;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    // Fonctions
    @Override
    public void draw(Displayable displayable) {
        new Line(top,left).draw(displayable);
        new Line (left, right).draw(displayable);
        new Line(right, top).draw(displayable);
    }

    
}
