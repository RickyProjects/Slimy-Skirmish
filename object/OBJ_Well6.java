package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well6 extends SuperObject {
    public OBJ_Well6() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wellf.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
