package object;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Grave1 extends SuperObject{
    public OBJ_Grave1() {

        name = "Grave";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/gravestone1.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
