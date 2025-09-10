package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot3a extends SuperObject{
    public OBJ_Pot3a() {

        name = "Pot3";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot3a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
