package Rays;

public class RaceCondition extends Thread{
	public static Account data=new Account();
	String name = null;
	public RaceCondition(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			data.deposite(name,1000);
		}
	}

}
