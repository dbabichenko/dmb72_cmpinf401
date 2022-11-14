
public abstract class Humanoid implements IMoveBehavior{

	@Override
	public void move(double distance) {
		System.out.println("A character moved " + distance + " meters");
		
	}

	@Override
	public void jump(double height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

}
