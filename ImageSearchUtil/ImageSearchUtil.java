import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageSearchUtil {
    /**
     * @param args
     */
    public static void main(String[] args)
        throws IOException{
            BufferedImage img = null;
            File f=null;

            //reading the image 
            try{
                f=new File(""D:\ImageSearchUtil\wall-e.jpg"");
                img=ImageIO.read(f);

            }
            catch (IOException e ){System.out.println(e);
            }

            int width =img.getWidth();
            int height=img.getHeight();

            //just using a single grid value
            //an algorithm will be used later 
            //to traverese thru the whole image 
            //depending on how the pixles are 
            //compared to the next image 
            int p=img.getRGB(0,0);
            




         

}
    // Evan add your method here

}
