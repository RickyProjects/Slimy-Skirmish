package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_RuneGlow2 extends SuperObject {
    public OBJ_RuneGlow2() {

        name = "RuneGlow";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/rune-pillar2b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
