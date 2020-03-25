package volodymyr;

public class Application {

	public static void main(String[] args) {
		
		Pet cat = ()->System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		Pet dog = ()->System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		Pet cow = ()->System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
	
		cat.voice();
		dog.voice();
		cow.voice();
	}
	
}

interface Pet{
	void voice();
}