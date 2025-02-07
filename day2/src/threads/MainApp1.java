package threads;

public class MainApp1 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" starts ");
		TablePrinter tablePrinter=new TablePrinter();
		
		DemoThread t1=new DemoThread(tablePrinter, 5);
		
		DemoThread t2=new DemoThread(tablePrinter, 7);
		
		DemoThread t3=new DemoThread(tablePrinter, 9);
		
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.println(Thread.currentThread().getName()+" exits ");
	}

}
