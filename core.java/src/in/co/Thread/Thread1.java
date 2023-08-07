package in.co.Thread;

public class Thread1 extends Thread {
	private String name = null;
	public Thread1(String n) {
		name = n ;
	}
		public void run() {
			for(int i=0; i<10; i++) {
				System.out.println(i+""+ name + getPriority());
			}
			
			
		}
	
		
	}


