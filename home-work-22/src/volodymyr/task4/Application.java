package volodymyr.task4;

public class Application {

	public static void main(String[] args) {
		
//		Amphibia am = new Amphibia();
//		Frog fg = new Frog();
//		am.toDoSms.toDos("I'm eating!");
//		am.toDoSms.toDos("I'm sleeping!");
//		am.toDoSms.toDos("I'm swimming!");
//		am.toDoSms.toDos("I'm walking!");
//		System.out.println();
//		fg.toDoSms.toDos("I'm eating!");
//		fg.toDoSms.toDos("I'm sleeping!");
//		fg.toDoSms.toDos("I'm swimming!");
//		fg.toDoSms.toDos("I'm walking!");
//		System.out.println();
		
		AmphibiaF frogEat = ()->System.out.println("I'm eating!");
		AmphibiaF frogSleap = ()->System.out.println("I'm sleeping!");
		AmphibiaF frogSwim = ()->System.out.println("I'm swimming!");
		AmphibiaF frogWalk = ()->System.out.println("I'm walking!");
		
		frogEat.toDo();
		frogSleap.toDo();
		frogSwim.toDo();
		frogWalk.toDo();		
	}
	
}

interface AmphibiaF{
	void toDo();
}