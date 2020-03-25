package volodymyr.task3;

public class Triangle {

	private double x, y, z;
	public Triangle() {
		x = y = 55;
	}
	
	public Triangle(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Triangle(double z) {
		this();
		this.z = z;
	}
	
	public Triangle(double y, double z) {
		this(z);
		this.y = y;
	}

	@Override
	public String toString() {
		return "Triangle [x= " + x + ", y= " + y + ", z= " + z + "]";
	}
	
}
