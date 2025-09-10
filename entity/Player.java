package entity;

import main.KeyHandler;
import java.awt.Rectangle;
import main.GamePanel;
import java.awt.Color;  
import java.awt.Graphics2D;
import java.io.IOException; 
import javax.imageio.ImageIO; 
import java.awt.image.BufferedImage;


public class Player extends Entity {
 
    GamePanel gp;
    KeyHandler keyH;

    public final int screenX;
    public final int screenY;

    //varialbles needed to ensure tasts tasks aren't repeated
    int intelligence = 0;
    int rockPuzzle = 0;
    int rockPuzzle2 = 0;
    int hasKey = 0;
    int redOrb = 0;
    int blueOrb = 0;
    int greenOrb = 0;
    int hammer = 0;
    int hammerOffer = 0;
    int potPuzzle = 0;
    int pot3 = 0;
    int pot2 = 0;
    int pot1 = 0;
    int chestLine2 = 0;
    int rockInfo = 1;
    int pot3Info = 1;
    int pot2Info = 1;
    int pot1Info = 1;
    int resonate = 0;
    int crateInfo = 1;
    int barrelInfo = 1;
    int runeRead = 1;
    int runeGlowInfo = 1;
    int wellInfo = 1;
    int wellOrbInfo = 1;
    int graveInfo = 1;
    int benchInfo = 1;
    int keyInfo = 1;
    int signInfo = 1;
    int shrineInfo = 1;
    int shrineTalkInfo = 1;
    int shoe = 0;

    public Player (GamePanel gp, KeyHandler keyH) {
        
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.TileSize/2);
        screenY = gp.screenHeight/2 - (gp.TileSize/2);

        // character hitbox
        solidArea = new Rectangle();
        solidArea.x = 10;
        solidArea.y = 41;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 44;
        solidArea.height = 23;

        setDefaultValues();
        getPlayerImage();
    }

    // sets spawn location on the map
    // pre: worldX = spawn location coordinate, worldY = spawn location coordinate
    // post: player spawns in the middle of the map, on an altar
    public void setDefaultValues() {
        worldX = gp.TileSize * 20 + 4;
        worldY = gp.TileSize * 19 - 24;
        speed = 3;
        direction = "down";
    }

    // scans the sprites to allow to show on screen
    // pre: there must be scannable pngs in player file
    // post: images are read and can be placed on screen
    public void getPlayerImage() {
        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/right0.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/right1.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/right2.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/right3.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/left0.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/left1.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/left2.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/res/player/player/left3.png"));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void update() {
        // allows for the system to understand what a key does when its pressed
        // pre: key must be pressed
        // key press was recognised
        if (keyH.upPressed == true || keyH.downPressed == true || keyH.rightPressed == true || keyH.leftPressed == true){
            if (keyH.upPressed == true) {
            direction = "up";
        }
        else if(keyH.downPressed == true) {
            direction = "down";
        }
        else if(keyH.leftPressed == true) {
            direction = "left";
        }
        else if(keyH.rightPressed == true) {
            direction = "right";
        }

        collisionOn = false;
        gp.cChecker.checkTile(this);

        //checks for object collision
        int objIndex = gp.cChecker.checkObject(this, true);
        pickUpObject(objIndex);

        if(collisionOn == false) {
            switch(direction) {
            case "up":
                worldY -= speed;
            break;
            case "down":
                worldY += speed;
            break;
            case "left":
                worldX -= speed;
            break;
            case "right":
                worldX += speed;
            break;
            }
        }
// player animation
        spriteCounter++;
        if (spriteCounter > 7) {
            if (spriteNum == 1) {
                spriteNum = 2;
            }
            else if (spriteNum == 2) {
                spriteNum = 3;
            }
            else if (spriteNum == 3) {
                spriteNum = 4;
            }
            else if (spriteNum == 4) {
                spriteNum = 1;
            }
        spriteCounter = 0;
        }

        
    }
    
    }
    public void pickUpObject(int i) {
// checks when an object is interacted with
// pre: playerX and playerY must be colliding with the objects X and Y coordinates
// the object is collected, an event takes place
        
        if(i != 999) {

            String objectName = gp.obj[i].name;

            // gameplay (object interaction, sounds, test, information, stat boosts, etc)
            switch(objectName) {
                case "Key":
                    hasKey ++;
                    gp.obj[i] = null;
                    gp.playSE(10);
                    gp.ui.showMessage("You found a key!");
                    break;
                case "Chest":
                if (hasKey > 0) {
                    gp.obj[i] = null;
                    hasKey--;
                    gp.ui.showMessage("The chest had running shoes in it! ");
                    gp.ui.showMessage2("Despite being a slime, this inspires you to run faster! (+5 SPEED)."); 
                    speed += 1;
                    gp.playSE(7);
                    shoe += 1;
                }
                else if (keyInfo == 1) {
                    gp.ui.showMessage("You need a key.");
                    gp.playSE(6);
                    keyInfo --;
                }
                break;
                case "Sign":
                    if(signInfo == 1){
                    signInfo --;
                    gp.playSE(11);
                    gp.ui.showMessage("East: The Fractured Ruins");
                }
                break;
                case "Shrine":
                    if(shrineInfo == 1){
                    shrineInfo --;
                    gp.playSE(6);
                    gp.ui.showMessage("The shrine compells you to face it.");
                
                }
                break;
                case "ShrineTalk":
                if(shoe == 1){
                    if(shrineTalkInfo == 1){
                        shrineTalkInfo --;
                    }
                    shoe --;
                    gp.ui.showMessage("You get the feeling you shouldn't offer her your shoes.");
                    gp.playSE(6);
                }
                if(redOrb == 1) {
                    if(shrineTalkInfo == 1){
                        shrineTalkInfo --;
                    }
                    redOrb --;
                    intelligence += 1;
                    gp.playSE(14);
                    gp.ui.showMessage("The red orb seems to fit perfectly into the shrine!");
                    gp.ui.showMessage("You feel a wave of memories and knowledge wash over you. (+5 INTELLIGENCE)");
                }
                if(hammerOffer == 1){
                    if(shrineTalkInfo == 1){
                        shrineTalkInfo --;
                    }
                    hammerOffer --;
                    gp.playSE(6);
                    gp.ui.showMessage("You get the feeling you shouldn't offer her your hammer.");
                    
                }
                if(blueOrb == 1) {
                    if(shrineTalkInfo == 1){
                        shrineTalkInfo --;
                    }
                    gp.playSE(14);
                    blueOrb --;
                    intelligence += 1;
                    gp.ui.showMessage("The blue orb seems to fit perfectly into the shrine!");
                    gp.ui.showMessage2("You feel a wave of joy and nostalgia wash over you. (+5 INTELLIGENCE).");
                }
                if(greenOrb == 1) {
                    
                    if(shrineTalkInfo == 1){
                        shrineTalkInfo --;
                    }
                    greenOrb --;
                    gp.playSE(14);
                    intelligence += 1;
                    gp.ui.showMessage("The green orb seems to fit perfectly into the shrine! ");
                    gp.ui.showMessage2("You feel a wave of tranquility wash over you. (+5 INTELLIGENCE).");
                }
                if(shrineTalkInfo == 1){
                    shrineTalkInfo --;
                    gp.playSE(14);
                    gp.ui.showMessage("It seems like there's a slot for offerings.");
                    gp.ui.showMessage2("You feel like you should bring it something.");
                }
                break;
                case "Bench":
                if (benchInfo == 1) {
                    benchInfo --;
                    gp.ui.showMessage("You really wish you could sit on the bench, however, you are a slime.");
                    
                    }
                    break;
                case "Grave":
                if (graveInfo == 1) {
                    graveInfo --;
                    gp.playSE(8);
                    gp.ui.showMessage("You wonder who could've lived here in the past.");
                }
                break;
                case "Well":
                if (wellInfo == 1) {
                    wellInfo --;
                    gp.playSE(6);
                    gp.ui.showMessage("You spot something resonating from the bottom of the well. ");
                    gp.ui.showMessage2("It seems like it's too far away to reach.");
                    gp.ui.showMessage3("Try approaching it from a more accesible place.");
                }
                break;
                case "WellOrb":
                if (wellInfo == 0 && wellOrbInfo == 1) {
                    wellOrbInfo --;
                    redOrb ++;
                    gp.playSE(2);
                    gp.ui.showMessage("Since this section of the wall is broken, you reach down ");
                    gp.ui.showMessage2("and grab a glowing red orb. ");
                    gp.ui.showMessage3("It seems to pull you towards the shrine.");
                    
                }
                break;
                case "RuneGlow":
                    if (runeGlowInfo == 1) {
                        runeGlowInfo --;
                        gp.playSE(6);
                        gp.ui.showMessage("You feel like you could decipher the runes if you were a little smarter.");
                    }
                    if (intelligence >= 1 && runeRead == 1) {
                        runeRead --;
                        potPuzzle ++;
                        rockPuzzle2 ++;
                        gp.playSE(14);
                        gp.ui.showMessage("It says, \"POTS -~- Right. Left. Middle\".");
                    }
                break;
                case "Barrel":
                    if (barrelInfo == 1) {
                        barrelInfo --;
                        gp.ui.showMessage("It seems to be barricaded. The crate is especially sturdy.");
                        gp.ui.showMessage2("If you had a hammer, the barrel could easily be destroyed.");
                        gp.playSE(6);
                    }
                    if (hammer == 1) {
                        gp.obj[i] = null;
                        gp.playSE(5);
                        gp.ui.showMessage("With your hammer, you were able to destroy the barrel!");
                    }
                break;
                case "Crate2":
                    if (crateInfo == 1) {
                        crateInfo --;
                        hammer ++;
                        hammerOffer ++;
                        gp.ui.showMessage("It looks like something is inside the crate.");
                        gp.ui.showMessage2("You found a hammer!");
                        gp.playSE(1);
                    }
                break;
                case "Pot1":
                    if (potPuzzle == 1 && pot1Info == 1) {
                        if (pot2 == 0 && pot3 == 1) {
                            pot1Info = 0;
                            pot1 = 1;
                            gp.ui.showMessage2("The pots resonate louder.");
                            gp.playSE(13);
                        }
                    }
                break;
                case "Pot2":
                    if (potPuzzle == 1 && pot2Info == 1) {
                        if (pot1 == 1 && pot3 == 1) {
                            pot2Info = 0;
                            blueOrb = 1;
                            rockPuzzle ++;
                            gp.playSE(3);
                            gp.ui.showMessage("A blue orb pops out of the pot!");
                            gp.ui.showMessage2("There is also a note containing the message: \\\"Head south west of the ");
                            gp.ui.showMessage3("large rock if you wish to continue your journey\".");
                        }
                    }
                break;
                case "Pot3":
                    if (potPuzzle == 1 && pot3Info == 1) {
                        if (pot1 == 0 && pot2 == 0) {
                            pot3Info = 0;
                            pot3 = 1;
                            resonate = 1;
                            gp.playSE(12);
                            gp.ui.showMessage("The pots resonate.");
                        }
                    }
                break;
                case "BigRock":
                    if (rockPuzzle2 == 1) {
                        rockPuzzle2 --;
                        gp.ui.showMessage("This seems like the rock the note was talking about.");
                        gp.ui.showMessage2("You should head south west.");
                        gp.playSE(11);
                    }
                break;
                case "Rock":
                    if (rockInfo == 1) {
                        rockInfo --;
                        gp.ui.showMessage("You wonder why these rocks are placed so precisely.");
                    }
                    if (rockPuzzle == 1) {
                        rockPuzzle ++;
                        gp.playSE(9);
                        gp.ui.showMessage("After taking a closer look, you realize there's text on the rocks.");
                        gp.ui.showMessage2("They all say \"look under middle rock\".");
                    }
                break;
                case "PuzzleRock":
                    if (rockPuzzle == 2) {
                        rockPuzzle ++;
                        greenOrb ++;
                        gp.playSE(4);
                        gp.ui.showMessage("You reach under the rock find a green orb!");
                        gp.ui.showMessage2("Like the others, this pulls you towards the shrine.");
                    }
                break;

            }
        }
    }
    public void draw(Graphics2D g2) {

        g2.setColor(Color.DARK_GRAY);
        g2.fillOval((gp.screenWidth/2 - (gp.TileSize/2))-3, (gp.screenHeight/2 - (gp.TileSize/2))+49, 70, 24);

        BufferedImage image = null;

        switch(direction) {
            case "up":
            if (spriteNum == 1) {
                image = up1;
            }
            if (spriteNum == 2) {
                image = up2;
            }
            if (spriteNum == 3) {
                image = right1;
            }
            if (spriteNum == 4) {
                image = right2;
            }
                break;
            case "down":
                if (spriteNum == 1) {
                image = down1;
            }
            if (spriteNum == 2) {
                image = down2;
            }
            if (spriteNum == 3) {
                image = left1;
            }
            if (spriteNum == 4) {
                image = left2;
            }
                break;
            case "right":
                if (spriteNum == 1) {
                image = up1;
            }
            if (spriteNum == 2) {
                image = up2;
            }
            if (spriteNum == 3) {
                image = right1;
            }
            if (spriteNum == 4) {
                image = right2;
            }
                break;
            case "left":
                if (spriteNum == 1) {
                image = left1;
            }
            if (spriteNum == 2) {
                image = left2;
            }
            if (spriteNum == 3) {
                image = down1;
            }
            if (spriteNum == 4) {
                image = down2;
            }
                break;

        }

        g2.drawImage(image, screenX, screenY, gp.TileSize, gp.TileSize, null);
    }
}
