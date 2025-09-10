package tile;

import javax.imageio.ImageIO; 
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.awt.Graphics2D;
import main.GamePanel;  

public class TileManager {
    
    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[] [];

    public TileManager(GamePanel gp) {

        this.gp = gp;

        //declares the amount of maximum types of tiles to optimize game
        tile = new Tile[100];
        mapTileNum = new int[gp.maxWorldCol] [gp.maxWorldRow];

        getTileImage();
        loadMap("/res/player/maps/map01.txt");
    }

    public void getTileImage() {

        try {
// declares tiles and allows for chosen tiles to have collision
// pre: tile png needed
// tiles are ready to be placed in the map text file
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/plain.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/grass1.png"));

            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/grass2.png"));

            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/grass3.png"));

            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/flower1.png"));

            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/flower2.png"));

            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/flower3.png"));

            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement1.png"));

            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement2.png"));

            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement3.png"));

            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement4.png"));

            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/cracked1.png"));

            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/cracked2.png"));

            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn1.png"));

            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn2.png"));

            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn3.png"));

            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn4.png"));

            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn5.png"));

            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn6.png"));

            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn7.png"));

            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn8.png"));

            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/spawn9.png"));

            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall-top1.png"));
            tile[22].collision = true;

            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall-top2.png"));
            tile[23].collision = true;

            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall-bottom1.png"));
            tile[24].collision = true;

            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall-bottom2.png"));
            tile[25].collision = true;

            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/barrel.png"));
            tile[26].collision = true;

            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/res/player/objects/chest-1.png"));
            tile[27].collision = true;

            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement5.png"));

            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement6.png"));

            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement7.png"));

            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall16.png"));
            tile[31].collision = true;

            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall17.png"));
            tile[32].collision = true;

            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall18.png"));
            tile[33].collision = true;

            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall19.png"));
            tile[34].collision = true;

            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall7.png"));
            tile[35].collision = true;

            tile[36] = new Tile();
            tile[36].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall8a.png"));
            tile[36].collision = true;

            tile[37] = new Tile();
            tile[37].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall9b.png"));
            tile[37].collision = true;

            tile[38] = new Tile();
            tile[38].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall6.png"));
            tile[38].collision = true;

            tile[39] = new Tile();
            tile[39].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall8b.png"));
            tile[39].collision = true;

            tile[40] = new Tile();
            tile[40].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall9a.png"));
            tile[40].collision = true;

            tile[41] = new Tile();
            tile[41].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall20.png"));
            tile[41].collision = true;
            
            tile[42] = new Tile();
            tile[42].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall14.png"));
            tile[42].collision = true;

            tile[43] = new Tile();
            tile[43].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall15.png"));
            tile[43].collision = true;

            tile[44] = new Tile();
            tile[44].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall12.png"));
            tile[44].collision = true;

            tile[45] = new Tile();
            tile[45].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall13.png"));
            tile[45].collision = true;

            tile[46] = new Tile();
            tile[46].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall10a.png"));
            tile[46].collision = true;

            tile[47] = new Tile();
            tile[47].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/wall11a.png"));
            tile[47].collision = true;

            tile[48] = new Tile();
            tile[48].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/plain.png"));
            tile[48].collision = true;

            tile[49] = new Tile();
            tile[49].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair1.png"));

            tile[50] = new Tile();
            tile[50].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair2.png"));

            tile[51] = new Tile();
            tile[51].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair3.png"));

            tile[52] = new Tile();
            tile[52].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair4.png"));

            tile[53] = new Tile();
            tile[53].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair5.png"));

            tile[54] = new Tile();
            tile[54].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/stair6.png"));

            tile[55] = new Tile();
            tile[55].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement2.png"));
            tile[55].collision = true;

            tile[56] = new Tile();
            tile[56].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/pavement4.png"));
            tile[56].collision = true;

            tile[57] = new Tile();
            tile[57].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/flower2.png"));
            tile[57].collision = true;

            tile[58] = new Tile();
            tile[58].image = ImageIO.read(getClass().getResourceAsStream("/res/player/tiles/flower2.png"));
            tile[58].collision = true;

        }catch(IOException e) {
            e.printStackTrace();
        }

    }
    public void loadMap(String filePath) {
// reads the information on the map file
//pre: map file must be filled out (40x40) 1600 tiles.
// the map is shown on screen
        try {

            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader (is));

            int col = 0;
            int row = 0;
            while (col < gp.maxWorldRow && row < gp.maxWorldCol) {
                //places tiles on the map
                String line = br.readLine();

                while (col < gp.maxWorldRow) {

                    String numbers[] = line.split(" ");
                    int num = Integer.parseInt (numbers[col]);
                    
                    mapTileNum[col][row] = num;
                    col += 1;
                }
                if (col == gp.maxWorldRow); {
                    col = 0;
                    row += 1;
                }
            }
            br.close();
        }catch(Exception e){

        }


    }
    public void draw(Graphics2D g2) {
        //shows the map on the screen
        //pre: gets worldCol and worldRow to place on map in the correct order
        //the map is shown on window
        
        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldRow && worldRow < gp.maxWorldCol) {
            //checks for tile collision

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.TileSize;
            int worldY = worldRow * gp.TileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;


            if (worldX + gp.TileSize > gp.player.worldX - gp.player.screenX && 
                worldX - gp.TileSize < gp.player.worldX + gp.player.screenX && 
                worldY + gp.TileSize > gp.player.worldY - gp.player.screenY && 
                worldY - gp.TileSize < gp.player.worldY + gp.player.screenY) {

                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.TileSize, gp.TileSize, null);

            }
            
            worldCol += 1;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow += 1;
            }

        }

    }

}
