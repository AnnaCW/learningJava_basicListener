/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeansmodules.firstJava;

/**
 *
 * @author ACW
 */
import javax.sound.midi.*;

public class MusicTest1 {

    /**
     * @param args the command line arguments
     */
    public void play() {
        try {
           Sequencer sequencer = MidiSystem.getSequencer();
           System.out.println("We got a sequencer");
           
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
        
    }
    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
    
}
