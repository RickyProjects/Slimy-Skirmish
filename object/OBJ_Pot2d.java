package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot2d extends SuperObject{
    public OBJ_Pot2d() {

        name = "Pot2";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot2d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
