package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot1b extends SuperObject{
    public OBJ_Pot1b() {

        name = "Pot1";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot1b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
