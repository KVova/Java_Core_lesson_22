package volodymyr.task1;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		
		dropResult newSide = ()->{
			Random r = new Random();
			String side = r.nextBoolean() ? "Eagle" : "Rezhka";
			System.out.println(side);
		};
		
		newSide.coinThrow();
		newSide.coinThrow();
		newSide.coinThrow();
	}
}

interface dropResult{
	void coinThrow();
}