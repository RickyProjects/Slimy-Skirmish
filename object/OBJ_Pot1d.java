package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot1d extends SuperObject{
    public OBJ_Pot1d() {

        name = "Pot1";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot1d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
