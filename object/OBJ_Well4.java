package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well4 extends SuperObject {
    public OBJ_Well4() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-welld.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
