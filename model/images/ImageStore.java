package model.images;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageStore 
{
    public static BufferedImage airplane;    
    public static BufferedImage car;    
    public static BufferedImage eagle;    
    public static BufferedImage gi;    

    static{
        // String cwd = System.getProperty("user.dir");
        // System.out.println("cwd: " + cwd + "\n");
        airplane = readImage("model/images/airplane.jfif", 80, 60);
        airplane = readImage("model/images/.car.jfif", 70, 50);
        airplane = readImage("model/images/gi.jpg", 70, 50);
        airplane = readImage("model/images/eagle.jpg", 70, 50);
    }

    public static BufferedImage readImage(String path, int width, int height)
    {
        try{
            BufferedImage originalImage = ImageIO.read(new File(path));
            Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage resizedImage = new BufferedImage(width , height , BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = resizedImage.createGraphics();
            g2.drawImage(tmp, 0, 0, null);
            g2.dispose();
            return resizedImage;
        }
        catch(Exception e)
        {
            System.out.println("Image file load error");
        }
        return null;
    }
}
