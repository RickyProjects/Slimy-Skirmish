package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BigRock1 extends SuperObject{
    public OBJ_BigRock1() {

        name = "BigRock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/big-rock1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
