package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Shrine1 extends SuperObject {
    
    public OBJ_Shrine1() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
