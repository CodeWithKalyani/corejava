package in.co.Basics;

public class Fabonacci {
	public static void main(String[] args) {
		int n = 5;
		int a=1,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for(int i =3; i<n; i++)
		{
		c=a+b;
		System.out.println(c);
		
		a=b;
		b=a;
		
	}
	
	}}


