package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bench1 extends SuperObject{
    
    public OBJ_Bench1() {

        name = "Bench";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/bench1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
