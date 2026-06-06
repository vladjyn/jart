package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {

    private Point p1;
    private Point p2;
    private Color color;

    // constructeur
    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Points cannot be null");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.color = new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255));
    }

    public static Line random(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid image size");
        }
        Point p1 = Point.random(width, height);
        Point p2 = Point.random(width, height);
        return new Line(p1, p2);
    }

    @Override
    public void draw(Displayable displayable) {

        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;

        int err = dx - dy;

        while (true) {

            displayable.display(x1, y1, getColor());

            if (x1 == x2 && y1 == y2)
                break;

            int e2 = 2 * err;

            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }

            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
