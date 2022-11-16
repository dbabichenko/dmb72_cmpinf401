/*
 * Example from "Design Patterns - Adapter Pattern"
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
 */
public interface AdvancedMediaPlayer {
	public void playVlc(String fileName);
	public void playMp4(String fileName);
}
