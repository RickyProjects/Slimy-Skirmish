package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine6 extends SuperObject{
    
    public OBJ_Shrine6() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1f.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
