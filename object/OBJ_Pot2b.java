package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Pot2b extends SuperObject{
    public OBJ_Pot2b() {

        name = "Pot2";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/pot2b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
