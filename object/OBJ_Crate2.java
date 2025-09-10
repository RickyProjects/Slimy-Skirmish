package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Crate2 extends SuperObject{
    public OBJ_Crate2() {

        name = "Crate2";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/crate2.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
