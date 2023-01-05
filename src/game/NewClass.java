/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
public class NewClass {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("tinhae.wav");
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
        Clip cl=AudioSystem.getClip();
       
        cl.open(audio);
        cl.start();
    }

}
