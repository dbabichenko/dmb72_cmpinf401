
public interface IMoveBehavior {
	
	public final double GRAVITY = 9.8;
	
	public void move(double distance);
	public void jump(double height);
	public void fall();
	public void die();

}
