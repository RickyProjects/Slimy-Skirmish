package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Barrel extends SuperObject{
    public OBJ_Barrel() {
        //gets the file for the image, allowing it to be placed on screen. 
        //pre: having a png to scan
        //instantiates object and decides whether this type of object has collision or not

        name = "Barrel";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/barrel.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
        
        collision = true;
    }
}
