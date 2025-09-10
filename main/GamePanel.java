package main;

import tile.TileManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import entity.Player;
import object.SuperObject;

public class GamePanel extends JPanel implements Runnable{
    final int originalTileSize = 64;
    final int scale = 1;
    public final int TileSize = originalTileSize * scale;
    public final int maxScreenRow = 16;
    public final int maxScreenCol = 8;
    public final int screenWidth = TileSize * maxScreenRow;
    public final int screenHeight = TileSize * maxScreenCol;

    public final int maxWorldRow = 40;
    public final int maxWorldCol = 40;
    int FPS = 60; 

    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Sound music = new Sound();
    Sound se = new Sound();
    public CollisionChecker cChecker = new CollisionChecker(this);
    public AssetSetter aSetter = new AssetSetter(this);
    public UI ui = new UI(this);
    Thread gameThread;

    public Player player = new Player(this, keyH);
    public SuperObject obj[] = new SuperObject[75];

    int playerX = 128;
    int playerY = 184;
    int playerSpeed = 5;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    } 

    public void startGameThread() {
        gameThread = new Thread(this); 
        gameThread.start();
    }

    public void setupGame() {

        aSetter.setObject();
        
        playMusic(0);
    }

    public void run() {
//nanotime counts in billions. chaning it to fps to create a stable count for the game.
//pre: gets the nanoseconds and divides by a billion
//stable fps counter is acquired
        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if(delta >= 1) {

            update();
            repaint();
            delta--;

            }
        }
    }

    public void update() {
//updates player stats, sprites and collision
//
//player is updated
        
        player.update();

    }

    public void paintComponent(Graphics g) {
            // puts everything on the screen
            // gets tile, object and player information from other classes and packages
            // things are visually on the screen

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        //TILE
        tileM.draw(g2);

        //OBJECT
        for(int i = 0; i < obj.length; i++) {
            if(obj[i] != null) {
                obj[i].draw(g2, this);
            }
        }

        //PLAYER
        player.draw(g2);

        ui.draw(g2);

        g2.dispose();
    }
    public void playMusic(int i) {
        //plays music
        //pre: music file needed
        //music is played
        music.setFile(i);
        music.play();
        music.loop();

    }
    public void stopMusic() {
        //stops music
        //pre: none
        //music is stopped
        se.stop();
    }
    public void playSE(int i) {
        //plays sound effect
        //pre: sound file needed
        //sound is played

        se.setFile(i);
        se.play();
    }
}
