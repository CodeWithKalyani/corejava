package in.co.Thread;

public class TestThread1 {
	public static void main(String[] args) {
		Thread1 t1 = new  Thread1("kallu");
		Thread1 t2 = new Thread1("ballu");
		Thread1 t3 = new Thread1("vaish");
		t1.setPriority(1);
		t2.setPriority(7);
		t3.setPriority(5);
		
		
		t1.getPriority();
		t2.getPriority();
		t3.getPriority();
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
