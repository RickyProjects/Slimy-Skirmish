package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot3b extends SuperObject{
    public OBJ_Pot3b() {

        name = "Pot3";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot3b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
