package object;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Grave2 extends SuperObject{
    public OBJ_Grave2() {

        name = "Grave";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/gravestone2.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
