package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Rock4 extends SuperObject{
    public OBJ_Rock4() {

        name = "PuzzleRock";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/big-rock2.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
