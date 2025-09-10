package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bench2 extends SuperObject{
    
    public OBJ_Bench2() {

        name = "Bench";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/bench1b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
