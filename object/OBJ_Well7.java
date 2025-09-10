package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well7 extends SuperObject {
    public OBJ_Well7() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-wellg.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
