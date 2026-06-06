package jart.geometrical_shapes;

public class Line implements Drawable {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static Line random(int width, int height) {
        return null;
    }

    @Override
    public void draw(Displayable displayable) {

    }

    @Override
    public Color getColor() {
        return null;
    }
}
