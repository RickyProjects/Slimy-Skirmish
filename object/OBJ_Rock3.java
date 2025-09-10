package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Rock3 extends SuperObject{
    public OBJ_Rock3() {

        name = "Rock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/brick3.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
