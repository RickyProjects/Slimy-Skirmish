package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine2 extends SuperObject {
    
    public OBJ_Shrine2() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
