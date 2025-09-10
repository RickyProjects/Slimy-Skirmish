package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well3 extends SuperObject {
    public OBJ_Well3() {

        name = "WellOrb";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wellc.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
