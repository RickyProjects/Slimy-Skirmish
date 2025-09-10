package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Rock2 extends SuperObject{
    public OBJ_Rock2() {

        name = "Rock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/brick2.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
