package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private int width;
    private int height;
    private BufferedImage image;

    public Image(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void display(int x, int y, Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Color cannot be null");
        }

        if (x < 0 || x >= width || y < 0 || y >= height) {
            return;
        }
        image.setRGB(x, y, color.getRGB());
    }

    @Override
    public void save(String filename) {
        try {
            File file = new File(filename);
            ImageIO.write(image, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
