package jart.geometrical_shapes;
import java.awt.Color;

public class Triangle implements Drawable {
    // Attributs
    private Point p1;
    private Point p2;
    private Point p3;
    private Color color;

    // Constructeur
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = new Color(
        (int)(Math.random() * 255),
        (int)(Math.random() * 255),
        (int)(Math.random() * 255)
        );
    }

    // Getters & setters
    public Point getP1() {return this.p1;}
    public Point getP2() {return this.p2;}
    public Point getP3() {return this.p3;}
    @Override
    public Color getColor() {return this.color;}


    public void setP1(Point top) {this.p1 = top; }
    public void setP2(Point left) {this.p2 = left;}
    public void setP3(Point right) {this.p3 = right;}
    public void setColor(Color color) {this.color = color;}

    // Méthodes
    @Override
    public void draw(Displayable displayable) {
        new Line(p1,p2).draw(displayable);
        new Line (p2, p3).draw(displayable);
        new Line(p3, p1).draw(displayable);
    }

    
}
