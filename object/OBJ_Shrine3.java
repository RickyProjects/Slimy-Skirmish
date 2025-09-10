package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine3 extends SuperObject{
    
    public OBJ_Shrine3() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1c.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
