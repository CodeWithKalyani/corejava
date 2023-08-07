package Rays;

public class Account {
	private int balance = 0;
	public synchronized void deposite(String msg,int amt) {
		int bal = getBalance();
		
		bal=bal+amt;
		setBalance(bal);
		System.out.println(msg+"new balance"+bal);
	}
	

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		this.balance = balance;
	}

}
