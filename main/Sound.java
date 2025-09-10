package main;

import java.net.URL;

import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;

public class Sound {
    
    Clip clip;
    //array limiting the amount of possible sounds to optimize game
    URL soundURL[] = new URL[30];

    public Sound() {
// gets the sound file, allowing for sounds to be played
        soundURL[0] = getClass().getResource("/res/player/sound/music.wav");
        soundURL[1] = getClass().getResource("/res/player/sound/hammer.wav");
        soundURL[2] = getClass().getResource("/res/player/sound/red orb.wav");
        soundURL[3] = getClass().getResource("/res/player/sound/blue orb.wav");
        soundURL[4] = getClass().getResource("/res/player/sound/green orb.wav");
        soundURL[5] = getClass().getResource("/res/player/sound/break.wav");
        soundURL[6] = getClass().getResource("/res/player/sound/cancel.wav");
        soundURL[7] = getClass().getResource("/res/player/sound/chest.wav");
        soundURL[8] = getClass().getResource("/res/player/sound/dig.wav");
        soundURL[9] = getClass().getResource("/res/player/sound/green oirb rock.wav");
        soundURL[10] = getClass().getResource("/res/player/sound/key.wav");
        soundURL[11] = getClass().getResource("/res/player/sound/paper.wav");
        soundURL[12] = getClass().getResource("/res/player/sound/pot1.wav");
        soundURL[13] = getClass().getResource("/res/player/sound/pot2.wav");
        soundURL[14] = getClass().getResource("/res/player/sound/shrine.wav");

    }

   
    public void setFile(int i) {
    // plays the sounds
    // pre: sound file must be instantiated
    // sounds are able to be played in the player class

        try{
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);

        }catch(Exception e) {
        }
    }
    public void play() {

        clip.start();

    }
    public void loop() {
        
        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }
    public void stop() {

        clip.stop();    

    }
}
