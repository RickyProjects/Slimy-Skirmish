package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Lantern1 extends SuperObject{
    public OBJ_Lantern1() {

        name = "Lantern";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/lantern1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
