package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Crate1 extends SuperObject{
    public OBJ_Crate1() {

        name = "Crate";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/crate1.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
