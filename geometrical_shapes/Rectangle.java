package geometrical_shapes;

public class Rectangle implements Drawable {
    // Attributs
    private Point topLeft;
    private Point bottomRight;
    private Color color;

    // Constructeurs
    public Rectangle() {
        this.topLeft = new Point(0, 0);
        this.topLeft = new Point(1, 1);
        this.color = "#FFFFFF";
    }

    public Rectangle(Point p1, Point p3, Color color) {
        this.topLeft = p1;
        this.bottomRight = p3;
        this.color = color;
    }

    // Setters
    public void setTopLeft(Point coord) {
        this.topLeft = coord;
    }

    public void setp3(Point coord) {
        this.bottomRight = coord;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Getters
    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getp3() {
        return this.bottomRight;
    }

     @Override
    public Color getColor() {
        return this.color;
    }
    
    // Fonctions
    @Override
    public void draw(Displayable displayable) {
        Point topRight = new Point(this.topLeft.getX(), this.bottomRight.getY());
        Point bottomLeft = new Point(this.bottomRight.getX(), this.topLeft.getY());

        new Line (topLeft, topRight).draw(displayable);
        new Line (topRight, bottomRight).draw(displayable);
        new Line (bottomRight, bottomLeft).draw(displayable);
        new Line (bottomLeft, topLeft).draw(displayable);
    }

   
}
