package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Sign3 extends SuperObject{
    public OBJ_Sign3() {

        name = "Sign";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/sign1c.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
