package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Sign2 extends SuperObject{
    public OBJ_Sign2() {

        name = "Sign";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/sign1b.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
