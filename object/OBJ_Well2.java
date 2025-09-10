package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well2 extends SuperObject {
    public OBJ_Well2() {

        name = "WellOrb";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wellb.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
