import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		ArrayList<IMoveBehavior> charList = new ArrayList<IMoveBehavior>();
		
		for(int i = 0; i<10; i++) {
			charList.add(new Elf());
			charList.add(new Troll());
			charList.add(new Knight());
			charList.add(new GiantBoulder());
		}
		
		charList.get(5).move(10);
		charList.get(7).move(10);
		charList.get(4).move(100);
		charList.get(17).move(10);
		
		System.out.println(charList.get(7) instanceof Troll);

	}

}
