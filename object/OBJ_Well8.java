package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well8 extends SuperObject {
    public OBJ_Well8() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wellh.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
