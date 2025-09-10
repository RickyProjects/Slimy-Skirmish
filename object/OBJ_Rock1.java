package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Rock1 extends SuperObject{
    public OBJ_Rock1() {

        name = "Rock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/brick1.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
