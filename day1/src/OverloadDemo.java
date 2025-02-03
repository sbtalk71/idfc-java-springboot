
public class OverloadDemo {

	public void add() {
		System.out.println("nothing to add..");
	}
	
	public int  add(int a, int b) {
		System.out.println("add(int, int) called..");
		return a+b;
	}
	
	public float  add(int a, float b) {
		System.out.println("add(int, float) called..");
		return a+b;
	}
	
	public double  add(double a, double b) {
		System.out.println("add(double, double) called..");
		return a+b;
	}
	public static void main(String[] args) {
		OverloadDemo od= new OverloadDemo();
		od.add(2f,2f);

	}

}
