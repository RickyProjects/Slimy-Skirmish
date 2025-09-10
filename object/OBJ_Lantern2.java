package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Lantern2 extends SuperObject{
    public OBJ_Lantern2() {

        name = "Lantern";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/lantern1b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
