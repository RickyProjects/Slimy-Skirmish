package main;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    //allows for key presses
    //pre: none
    //key presses are documented
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    //allows for key presses
    //pre: a key is pressed
    //an event takes place depending on the key press
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if(code == KeyEvent.VK_A) { 
            leftPressed = true;
        }
        if(code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if(code == KeyEvent.VK_D) {
            rightPressed = true; 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    //allows for key releases
    //pre: a key is released
    //an event takes place depending on the key release
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if(code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if(code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if(code == KeyEvent.VK_D) {
            rightPressed = false; 
        }
    }
    
}
