import javax.swing.JOptionPane;

public class Dice {
	private int sides;
	
	public Dice(int sides) {
		if(sides >= 2 && sides <= 6) {
			this.sides = sides;
		}
		else {
			this.sides = 6;
			JOptionPane.showMessageDialog(null, "You entered an invalid number of sides.  The number of sides was set to 6.");
		}
	}
	
	public Dice() {
		this.sides = 6;
	}
	
	public int roll(){
		int score = 
					(int)Math.round(sides*Math.random() + 1);
		return score;
	}
	public int getSides() {
		return this.sides;
	}

}
