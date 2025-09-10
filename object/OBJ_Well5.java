package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Well5 extends SuperObject {
    public OBJ_Well5() {

        name = "Well";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/broken-welle.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
