package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Shrine7 extends SuperObject{
    
    public OBJ_Shrine7() {

        name = "ShrineTalk";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/shrine1g.png"));

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
