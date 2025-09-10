package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well9 extends SuperObject {
    public OBJ_Well9() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-welli.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
