package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine8 extends SuperObject {
    
    public OBJ_Shrine8() {

        name = "ShrineTalk";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1h.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
