package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainApp3 {

	public static void main(String[] args) throws Exception{
		ExecutorService es=Executors.newFixedThreadPool(4);
		TablePrinter tr= new TablePrinter();
		es.execute(new Worker(tr, 2));
		es.execute(new Worker(tr, 3));
		es.execute(new Worker(tr, 4));
		es.execute(new Worker(tr, 5));
		
		es.awaitTermination(20, TimeUnit.SECONDS);
		
		System.out.println("Bye bye main");

	}

}
