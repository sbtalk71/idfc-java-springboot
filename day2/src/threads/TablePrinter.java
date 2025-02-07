package threads;

public class TablePrinter {

	public synchronized void printTable(int num) {
		System.out.println(Thread.currentThread().getName()+" in Table Printer ");
		try {
		for(int i=1;i<11;i++) {
			System.out.println(num+" x "+i+" = "+(i*num));
			Thread.sleep(1000);
		}
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
