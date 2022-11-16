/*
 * Example from "Design Patterns - Adapter Pattern"
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public class Mp4Player implements AdvancedMediaPlayer{

   @Override
   public void playVlc(String fileName) {
      //do nothing
   }

   @Override
   public void playMp4(String fileName) {
      System.out.println("Playing mp4 file. Name: "+ fileName);		
   }
}
