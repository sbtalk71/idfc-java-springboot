package threads;

public class Worker implements Runnable {
	private TablePrinter tablePrinter;
	private int num;

	public Worker(TablePrinter tablePrinter, int num) {
		this.tablePrinter = tablePrinter;
		this.num = num;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " starts ");
		tablePrinter.printTable(num);
		System.out.println(Thread.currentThread().getName() + " exits ");
	}
}
