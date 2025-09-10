package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot2a extends SuperObject{
    public OBJ_Pot2a() {

        name = "Pot2";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot2a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
