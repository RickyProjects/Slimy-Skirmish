package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class UI {
    
    GamePanel gp;
    Font arial_40;
    BufferedImage keyImage;
    //allows for 3 lines of text on the screen
    public boolean messageOn = false;
    public boolean messageOn2 = false;
    public boolean messageOn3 = false;
    public String message = "";
    public String message2 = "";
    public String message3 = "";
    public static int messageCounter = 0;
    public static int messageCounter2 = 0;
    public static int messageCounter3 = 0;

    public UI(GamePanel gp) {
        this.gp = gp;
        arial_40 = new Font("Consolas", Font.PLAIN, 25);

    }
    public void showMessage(String text) {

        message = text;
        messageOn = true;
    }
    public void showMessage2(String text) {

        message2 = text;
        messageOn2 = true;
    }
    public void showMessage3(String text) {

        message3 = text;
        messageOn3 = true;
    }
    
    
    public void draw (Graphics2D g2) {
        // declares the font, font size, font color and how to to display text
        // pre: font name, font size, color, where text is displayed 
        // text is palced on the screen

        g2.setFont(arial_40);
        g2.setColor(Color.white);

        if(messageOn == true) {

            g2.setFont(g2.getFont().deriveFont(25F));
            g2.drawString(message, gp.TileSize/2, gp.TileSize/2);

            messageCounter ++;

            if (messageCounter > 200) {
                messageCounter = 0;
                messageOn = false;

            }
        }
        if(messageOn2 == true) {

            g2.setFont(g2.getFont().deriveFont(25F));
            g2.drawString(message2, gp.TileSize/2, gp.TileSize);

            messageCounter2 ++;

            if (messageCounter2 > 200) {
                messageCounter2 = 0;
                messageOn2 = false;

            }
        }
        if(messageOn3 == true) {

            g2.setFont(g2.getFont().deriveFont(25F));
            g2.drawString(message3, gp.TileSize/2, 96);

            messageCounter3 ++;

            if (messageCounter3 > 200) {
                messageCounter3 = 0;
                messageOn3 = false;

            }
        }
    }

}
