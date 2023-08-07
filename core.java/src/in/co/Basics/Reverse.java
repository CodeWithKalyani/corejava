package in.co.Basics;

public class Reverse {
	public static void main(String[] args) {
		int n  = 123456, reverse = 0, lastdigit ;
		while(n>0) {
			lastdigit = n%10;
			reverse = reverse*10+lastdigit;
			n=n/10;
			
		}
		System.out.println(reverse);
		
	}

}
//(reverse = reverse*10+lastdigit
//
