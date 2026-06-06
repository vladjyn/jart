package jart.geometrical_shapes;
import java.awt.Color;

public class Rectangle implements Drawable {
    // Attributs
    private Point topLeft;
    private Point bottomRight;
    private Color color;

    // Constructeur
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = new Color(
        (int)(Math.random() * 255),
        (int)(Math.random() * 255),
        (int)(Math.random() * 255)
    );
    }

    // Getters & setters
    public Point getTopLeft() {return this.topLeft;}
    public Point getBottomRight() {return this.bottomRight;}
     @Override
    public Color getColor() {return this.color;}

    public void setTopLeft(Point coord) {this.topLeft = coord;}
    public void setBottomRight(Point coord) {this.bottomRight = coord;}
    public void setColor(Color color) {this.color = color;}
    
    // Méthodes
    @Override
    public void draw(Displayable displayable) {
        Point bottomLeft = new Point(this.topLeft.getX(), this.bottomRight.getY());
        Point topRight = new Point(this.bottomRight.getX(), this.topLeft.getY());

        new Line (topLeft, topRight).draw(displayable);
        new Line (topRight, bottomRight).draw(displayable);
        new Line (bottomRight, bottomLeft).draw(displayable);
        new Line (bottomLeft, topLeft).draw(displayable);
    }

   
}
