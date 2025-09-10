package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot3c extends SuperObject{
    public OBJ_Pot3c() {

        name = "Pot3";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot3c.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
