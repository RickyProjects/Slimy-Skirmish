package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine5 extends SuperObject{
    
    public OBJ_Shrine5() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1e.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
