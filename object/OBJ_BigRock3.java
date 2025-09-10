package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BigRock3 extends SuperObject{
    public OBJ_BigRock3() {

        name = "BigRock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/big-rock1c.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
