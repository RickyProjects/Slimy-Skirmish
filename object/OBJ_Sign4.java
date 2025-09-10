package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Sign4 extends SuperObject{
    public OBJ_Sign4() {

        name = "Sign";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/sign1d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
