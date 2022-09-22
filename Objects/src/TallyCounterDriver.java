
public class TallyCounterDriver {

	public static void main(String[] args) {
		TallyCounter t1 = new TallyCounter();
		TallyCounter t2 = new TallyCounter();
		
		
		for(int i = 1; i<= 50000; i++) {
			t1.click();
		}
		
		for(int i = 1; i<= 200; i++) {
			t2.click();
		}
		
		int total = t1.addTwoNumbers(t1.getCount(), t2.getCount());
		System.out.println(total);
		
		
		
		
		
	}

}
