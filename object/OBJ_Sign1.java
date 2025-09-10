package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Sign1 extends SuperObject{

    public OBJ_Sign1() {

        name = "Sign";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/sign1a.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
