package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well1 extends SuperObject {
    public OBJ_Well1() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wella.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
