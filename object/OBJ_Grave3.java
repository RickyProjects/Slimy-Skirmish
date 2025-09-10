package object;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Grave3 extends SuperObject{
    public OBJ_Grave3() {

        name = "Grave";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/gravestone3.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
