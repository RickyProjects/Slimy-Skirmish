package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot3d extends SuperObject{
    public OBJ_Pot3d() {

        name = "Pot3";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot3d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
