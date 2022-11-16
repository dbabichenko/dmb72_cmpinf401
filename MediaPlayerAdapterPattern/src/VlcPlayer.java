/*
 * Example from "Design Patterns - Adapter Pattern"
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class VlcPlayer implements AdvancedMediaPlayer{
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);		
   }

   @Override
   public void playMp4(String fileName) {
      //do nothing
   }
}