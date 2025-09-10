//
//Main.java
//My first java adventure/puzzle game. A top down adventurer.
//Maxime Seguin, Ricardo Atalla
//ICS4U
//1/19/2024
//

package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String args[]) {

// puts the screen on the screen
// pre: none?
// window is placed on the screen
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Game");
        window.setLocationRelativeTo(null);

        GamePanel gamePanel =  new GamePanel(); 
        window.add(gamePanel);
        window.pack();

        window.setVisible(true);  // Moved this line to the end
        
        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
    
}