package threads;

public class MainApp2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" starts ");
		TablePrinter tablePrinter=new TablePrinter();
		
		Thread t1=new Thread(new Worker(tablePrinter, 5));
		
		Thread t2=new Thread(new Worker(tablePrinter, 7));
		
		Thread t3=new Thread(new Worker(tablePrinter, 9));
		
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.println(Thread.currentThread().getName()+" exits ");
	}

}
