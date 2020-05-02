package cn.sxt.game;
 
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
 
public class 图片加载{
    // 工具类最好将构造器私有化。
    private 图片加载() {
     
    } 
 
    public static Image getImage(String path) {
        BufferedImage bi = null;
        try {
            URL u = 图片加载.class.getClassLoader().getResource(path);
            bi = ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}