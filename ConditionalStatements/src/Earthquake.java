
public class Earthquake {

	public static void main(String[] args) {
		double richter = 7.5;
		String description = "";
		
		if (richter >= 8.0)
		{
			description = "Most structures fall";
		}
		else if (richter >= 7.0)
		{
			description = "Many buildings destroyed";
		}
		else if (richter >= 6.0)
		{
			description = "Many buildings considerably damaged, some collapse";
		}
		else if (richter >= 4.5)
		{
			description = "Damage to poorly constructed buildings";
		}
		else
		{
			description = "No destruction of buildings";
		}

		System.out.println(description);
	}

}
