package geometrical_shapes;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point random(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid image size");
        }
        Random random = new Random();

        int x = random.nextInt(width);
        int y = random.nextInt(height);

        return new Point(x, y);
    }

    // getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
