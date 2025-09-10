package main;

import object.OBJ_Chest;
import object.OBJ_Crate1;
import object.OBJ_Crate2;
import object.OBJ_Key;
import object.OBJ_Lantern1;
import object.OBJ_Lantern2;
import object.OBJ_RuneGlow1;
import object.OBJ_RuneGlow2;
import object.OBJ_Shrine1;
import object.OBJ_Shrine2;
import object.OBJ_Shrine3;
import object.OBJ_Shrine4;
import object.OBJ_Shrine5;
import object.OBJ_Shrine6;
import object.OBJ_Shrine7;
import object.OBJ_Shrine8;
import object.OBJ_Barrel;
import object.OBJ_Bench1;
import object.OBJ_Bench2;
import object.OBJ_BigRock1;
import object.OBJ_BigRock2;
import object.OBJ_BigRock3;
import object.OBJ_BigRock4;
import object.OBJ_Sign1;
import object.OBJ_Sign2;
import object.OBJ_Sign3;
import object.OBJ_Sign4;
import object.OBJ_Well1;
import object.OBJ_Well2;
import object.OBJ_Well3;
import object.OBJ_Well4;
import object.OBJ_Well5;
import object.OBJ_Well6;
import object.OBJ_Well7;
import object.OBJ_Well8;
import object.OBJ_Well9;
import object.OBJ_Grave1;
import object.OBJ_Grave2;
import object.OBJ_Grave3;
import object.OBJ_Pot1a;
import object.OBJ_Pot1b;
import object.OBJ_Pot1c;
import object.OBJ_Pot1d;
import object.OBJ_Pot2a;
import object.OBJ_Pot2b;
import object.OBJ_Pot2c;
import object.OBJ_Pot2d;
import object.OBJ_Pot3a;
import object.OBJ_Pot3b;
import object.OBJ_Pot3c;
import object.OBJ_Pot3d;
import object.OBJ_Rock1;
import object.OBJ_Rock2;
import object.OBJ_Rock3;
import object.OBJ_Rock4;


public class AssetSetter {
    
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }
    // declares and places objects on screen
    // pre: must be a scannable png
    // objects are placed on screen
public void setObject() {
    
    gp.obj[0] = new OBJ_Key();
    gp.obj[0].worldX = 19 * gp.TileSize;
    gp.obj[0].worldY = 12 * gp.TileSize;

    gp.obj[1] = new OBJ_Chest();
    gp.obj[1].worldX = 24 * gp.TileSize;
    gp.obj[1].worldY = 7 * gp.TileSize;

    gp.obj[2] = new OBJ_Shrine1();
    gp.obj[2].worldX = 14 * gp.TileSize;
    gp.obj[2].worldY = 28 * gp.TileSize;

    gp.obj[3] = new OBJ_Shrine2();
    gp.obj[3].worldX = 15 * gp.TileSize;
    gp.obj[3].worldY = 28 * gp.TileSize;

    gp.obj[4] = new OBJ_Shrine3();
    gp.obj[4].worldX = 14 * gp.TileSize;
    gp.obj[4].worldY = 29 * gp.TileSize;

    gp.obj[5] = new OBJ_Shrine4();
    gp.obj[5].worldX = 15 * gp.TileSize;
    gp.obj[5].worldY = 29 * gp.TileSize;

    gp.obj[6] = new OBJ_Shrine5();
    gp.obj[6].worldX = 14 * gp.TileSize;
    gp.obj[6].worldY = 30 * gp.TileSize;

    gp.obj[7] = new OBJ_Shrine6();
    gp.obj[7].worldX = 15 * gp.TileSize;
    gp.obj[7].worldY = 30 * gp.TileSize;

    gp.obj[8] = new OBJ_Shrine7();
    gp.obj[8].worldX = 14 * gp.TileSize;
    gp.obj[8].worldY = 31 * gp.TileSize;

    gp.obj[9] = new OBJ_Shrine8();
    gp.obj[9].worldX = 15 * gp.TileSize;
    gp.obj[9].worldY = 31 * gp.TileSize;

    gp.obj[10] = new OBJ_Bench1();
    gp.obj[10].worldX = 21 * gp.TileSize;
    gp.obj[10].worldY = 13 * gp.TileSize;

    gp.obj[11] = new OBJ_Bench2();
    gp.obj[11].worldX = 21 * gp.TileSize;
    gp.obj[11].worldY = 14 * gp.TileSize;

    gp.obj[12] = new OBJ_Sign1();
    gp.obj[12].worldX = 14 * gp.TileSize;
    gp.obj[12].worldY = 16 * gp.TileSize;

    gp.obj[13] = new OBJ_Sign2();
    gp.obj[13].worldX = 15 * gp.TileSize;
    gp.obj[13].worldY = 16 * gp.TileSize;

    gp.obj[14] = new OBJ_Sign3();
    gp.obj[14].worldX = 14 * gp.TileSize;
    gp.obj[14].worldY = 17 * gp.TileSize;

    gp.obj[15] = new OBJ_Sign4();
    gp.obj[15].worldX = 15 * gp.TileSize;
    gp.obj[15].worldY = 17 * gp.TileSize;

    gp.obj[16] = new OBJ_Grave1();
    gp.obj[16].worldX = 32 * gp.TileSize;
    gp.obj[16].worldY = 15 * gp.TileSize;
    
    gp.obj[17] = new OBJ_Grave2();
    gp.obj[17].worldX = 36 * gp.TileSize;
    gp.obj[17].worldY = 15 * gp.TileSize;

    gp.obj[18] = new OBJ_Grave3();
    gp.obj[18].worldX = 34 * gp.TileSize;
    gp.obj[18].worldY = 14 * gp.TileSize;

    gp.obj[19] = new OBJ_Well1();
    gp.obj[19].worldX = 28 * gp.TileSize;
    gp.obj[19].worldY = 13 * gp.TileSize;

    gp.obj[20] = new OBJ_Well2();
    gp.obj[20].worldX = 29 * gp.TileSize;
    gp.obj[20].worldY = 13 * gp.TileSize;

    gp.obj[21] = new OBJ_Well3();
    gp.obj[21].worldX = 30 * gp.TileSize;
    gp.obj[21].worldY = 13 * gp.TileSize;

    gp.obj[22] = new OBJ_Well4();
    gp.obj[22].worldX = 28 * gp.TileSize;
    gp.obj[22].worldY = 14 * gp.TileSize;

    gp.obj[23] = new OBJ_Well5();
    gp.obj[23].worldX = 29 * gp.TileSize;
    gp.obj[23].worldY = 14 * gp.TileSize;

    gp.obj[24] = new OBJ_Well6();
    gp.obj[24].worldX = 30 * gp.TileSize;
    gp.obj[24].worldY = 14 * gp.TileSize;

    gp.obj[25] = new OBJ_Well7();
    gp.obj[25].worldX = 28 * gp.TileSize;
    gp.obj[25].worldY = 15 * gp.TileSize;

    gp.obj[26] = new OBJ_Well8();
    gp.obj[26].worldX = 29 * gp.TileSize;
    gp.obj[26].worldY = 15 * gp.TileSize;

    gp.obj[27] = new OBJ_Well9();
    gp.obj[27].worldX = 30 * gp.TileSize;
    gp.obj[27].worldY = 15 * gp.TileSize;

    gp.obj[28] = new OBJ_Lantern1();
    gp.obj[28].worldX = 23 * gp.TileSize;
    gp.obj[28].worldY = 16 * gp.TileSize;

    gp.obj[29] = new OBJ_Lantern2();
    gp.obj[29].worldX = 23 * gp.TileSize;
    gp.obj[29].worldY = 17 * gp.TileSize;

    gp.obj[30] = new OBJ_Lantern1();
    gp.obj[30].worldX = 17 * gp.TileSize;
    gp.obj[30].worldY = 16 * gp.TileSize;

    gp.obj[31] = new OBJ_Lantern2();
    gp.obj[31].worldX = 17 * gp.TileSize;
    gp.obj[31].worldY = 17 * gp.TileSize;

    gp.obj[32] = new OBJ_Lantern1();
    gp.obj[32].worldX = 32 * gp.TileSize;
    gp.obj[32].worldY = 12 * gp.TileSize;

    gp.obj[33] = new OBJ_Lantern2();
    gp.obj[33].worldX = 32 * gp.TileSize;
    gp.obj[33].worldY = 13 * gp.TileSize;

    gp.obj[34] = new OBJ_Lantern1();
    gp.obj[34].worldX = 37 * gp.TileSize;
    gp.obj[34].worldY = 10 * gp.TileSize;

    gp.obj[35] = new OBJ_Lantern2();
    gp.obj[35].worldX = 37 * gp.TileSize;
    gp.obj[35].worldY = 11 * gp.TileSize;

    gp.obj[36] = new OBJ_RuneGlow1();
    gp.obj[36].worldX = 28 * gp.TileSize;
    gp.obj[36].worldY = 8 * gp.TileSize;

    gp.obj[37] = new OBJ_RuneGlow2();
    gp.obj[37].worldX = 28 * gp.TileSize;
    gp.obj[37].worldY = 9 * gp.TileSize;

    gp.obj[38] = new OBJ_Crate1();
    gp.obj[38].worldX = 11 * gp.TileSize;
    gp.obj[38].worldY = 10 * gp.TileSize;

    gp.obj[39] = new OBJ_Barrel();
    gp.obj[39].worldX = 12 * gp.TileSize;
    gp.obj[39].worldY = 10 * gp.TileSize;

    gp.obj[40] = new OBJ_Crate2();
    gp.obj[40].worldX = 10 * gp.TileSize;
    gp.obj[40].worldY = 9 * gp.TileSize;

    gp.obj[41] = new OBJ_Pot1a();
    gp.obj[41].worldX = 30 * gp.TileSize;
    gp.obj[41].worldY = 8 * gp.TileSize;
    
    gp.obj[42] = new OBJ_Pot1b();
    gp.obj[42].worldX = 31 * gp.TileSize;
    gp.obj[42].worldY = 8 * gp.TileSize;

    gp.obj[43] = new OBJ_Pot1c();
    gp.obj[43].worldX = 30 * gp.TileSize;
    gp.obj[43].worldY = 9 * gp.TileSize;

    gp.obj[44] = new OBJ_Pot1d();
    gp.obj[44].worldX = 31 * gp.TileSize;
    gp.obj[44].worldY = 9 * gp.TileSize;

    gp.obj[45] = new OBJ_Pot2a();
    gp.obj[45].worldX = 32 * gp.TileSize;
    gp.obj[45].worldY = 6 * gp.TileSize;

    gp.obj[46] = new OBJ_Pot2b();
    gp.obj[46].worldX = 33 * gp.TileSize;
    gp.obj[46].worldY = 6 * gp.TileSize;

    gp.obj[47] = new OBJ_Pot2c();
    gp.obj[47].worldX = 32 * gp.TileSize;
    gp.obj[47].worldY = 7 * gp.TileSize;

    gp.obj[48] = new OBJ_Pot2d();
    gp.obj[48].worldX = 33 * gp.TileSize;
    gp.obj[48].worldY = 7 * gp.TileSize;

    gp.obj[49] = new OBJ_Pot3a();
    gp.obj[49].worldX = 34 * gp.TileSize;
    gp.obj[49].worldY = 8 * gp.TileSize;

    gp.obj[50] = new OBJ_Pot3b();
    gp.obj[50].worldX = 35 * gp.TileSize;
    gp.obj[50].worldY = 8 * gp.TileSize;

    gp.obj[51] = new OBJ_Pot3c();
    gp.obj[51].worldX = 34 * gp.TileSize;
    gp.obj[51].worldY = 9 * gp.TileSize;

    gp.obj[52] = new OBJ_Pot3d();
    gp.obj[52].worldX = 35 * gp.TileSize;
    gp.obj[52].worldY = 9 * gp.TileSize;

    gp.obj[53] = new OBJ_BigRock1();
    gp.obj[53].worldX = 16 * gp.TileSize;
    gp.obj[53].worldY = 20 * gp.TileSize;

    gp.obj[54] = new OBJ_BigRock2();
    gp.obj[54].worldX = 17 * gp.TileSize;
    gp.obj[54].worldY = 20 * gp.TileSize;

    gp.obj[55] = new OBJ_BigRock3();
    gp.obj[55].worldX = 16 * gp.TileSize;
    gp.obj[55].worldY = 21 * gp.TileSize;

    gp.obj[56] = new OBJ_BigRock4();
    gp.obj[56].worldX = 17 * gp.TileSize;
    gp.obj[56].worldY = 21* gp.TileSize;

    gp.obj[57] = new OBJ_Rock1();
    gp.obj[57].worldX = 4 * gp.TileSize;
    gp.obj[57].worldY = 26 * gp.TileSize;

    gp.obj[58] = new OBJ_Rock2();
    gp.obj[58].worldX = 5 * gp.TileSize;
    gp.obj[58].worldY = 28 * gp.TileSize;

    gp.obj[59] = new OBJ_Rock3();
    gp.obj[59].worldX = 9 * gp.TileSize;
    gp.obj[59].worldY = 28 * gp.TileSize;

    gp.obj[60] = new OBJ_Rock4();
    gp.obj[60].worldX = 7 * gp.TileSize;
    gp.obj[60].worldY = 26 * gp.TileSize;

    gp.obj[61] = new OBJ_Rock1();
    gp.obj[61].worldX = 9 * gp.TileSize;
    gp.obj[61].worldY = 24 * gp.TileSize;

    gp.obj[62] = new OBJ_Rock2();
    gp.obj[62].worldX = 7 * gp.TileSize;
    gp.obj[62].worldY = 23 * gp.TileSize;

    gp.obj[63] = new OBJ_Rock3();
    gp.obj[63].worldX = 5 * gp.TileSize;
    gp.obj[63].worldY = 24 * gp.TileSize;

    gp.obj[64] = new OBJ_Rock2();
    gp.obj[64].worldX = 7 * gp.TileSize;
    gp.obj[64].worldY = 29 * gp.TileSize;

    gp.obj[65] = new OBJ_Rock1();
    gp.obj[65].worldX = 10 * gp.TileSize;
    gp.obj[65].worldY = 26 * gp.TileSize;

}
    
}
