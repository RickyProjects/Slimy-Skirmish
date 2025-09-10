package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot1a extends SuperObject{
    public OBJ_Pot1a() {

        name = "Pot1";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
