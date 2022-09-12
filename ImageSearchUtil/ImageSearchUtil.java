import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageSearchUtil {
    /**
     * @param args
     */
    public static void main(String[] args)
            throws IOException {
        BufferedImage img = null;
        File f = null;
        FileWriter writer = new FileWriter("D:\\ImageSearchUtil\\pixel_values.txt");

        // reading the image
        try {
            f = new File("D:\\ImageSearchUtil\\wall-e.jpg");
            img = ImageIO.read(f);

        } catch (IOException e) {
            System.out.println(e);
        }

        // writes the pixel info to a file, also converts the pixel to a color
        int width = img.getWidth();
        int height = img.getHeight();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                Color color = new Color(p, true);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                writer.append(red + "");
                writer.append(green + "");
                writer.append(blue + "");

                writer.append("\n");
                writer.flush();

            }
        }
        writer.close();
        System.out.println("complete!");

        // just using a single grid value
        // an algorithm will be used later
        // to traverese thru the whole image
        // depending on how the pixles are
        // compared to the next image

    }
    // Evan add your method here
}
