package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot1c extends SuperObject{
    public OBJ_Pot1c() {

        name = "Pot1";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot1c.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
