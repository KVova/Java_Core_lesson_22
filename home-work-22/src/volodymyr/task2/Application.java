package volodymyr.task2;

public class Application {

	public static void main(String[] args) {
		
		Number<Double> MinDouble = ()->Double.MIN_VALUE;
		Number<Double> Maxdouble = ()->Double.MAX_VALUE;
		Number<Float> MinFloat = ()->Float.MIN_VALUE;
		Number<Float> MaxFloat = ()->Float.MIN_VALUE;

		System.out.println("Min double "+ MinDouble.value() + " Max double "+ Maxdouble.value());
		System.out.println("Min float "+ MinFloat.value() + " Max float "+ MaxFloat.value());

	}

}

interface Number<T>{
	T value();
}