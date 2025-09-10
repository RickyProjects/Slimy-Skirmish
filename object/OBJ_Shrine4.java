package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine4 extends SuperObject{
    
    public OBJ_Shrine4() {

        name = "Shrine";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1d.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
