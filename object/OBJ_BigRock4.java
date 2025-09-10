package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BigRock4 extends SuperObject{
    public OBJ_BigRock4() {

        name = "BigRock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/big-rock1d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
