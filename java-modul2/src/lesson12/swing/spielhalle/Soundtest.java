package lesson12.swing.spielhalle;

/**
 * Created by MOHCTP on 18.01.2017 Да.
 */

import javax.sound.sampled.*;
import java.io.File;

/*
 * SoundTest.java
 *
 * Created on 1. August 2003, 21:06
 */

/**
 *
 * @author  Administrator
 */
public class Soundtest {

    /** Creates a new instance of SoundTest */
    public Soundtest() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("P:\\Java\\Progs\\JetBrains\\IdeaProjects\\andron13\\src\\Spielhalle\\chord.wav"));
            AudioFormat af     = audioInputStream.getFormat();
            int size      = (int) (af.getFrameSize() * audioInputStream.getFrameLength());
            byte[] audio       = new byte[size];
            DataLine.Info info      = new DataLine.Info(Clip.class, af, size);
            audioInputStream.read(audio, 0, size);

            // for(int i=0; i < 32; i++) {
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(af, audio, 0, size);
            clip.start();
            // }
        }catch(Exception e){ e.printStackTrace(); }

    }

}