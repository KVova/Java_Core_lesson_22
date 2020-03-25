package volodymyr.task3;

public class Application {

	public static void main(String[] args) {
		
		TriangleEqul teq = Triangle::new;
		TriangleCust tcu = Triangle::new;
		
		System.out.println(teq.creat(12));
		System.out.println(tcu.create(10, 7));
	}

}

interface TriangleEqul{
	Triangle creat(double z);
}

interface TriangleCust{
	Triangle create(double x, double y);
}