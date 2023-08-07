package in.co.java8;

public interface TestInterf {
public static void main(String[] args) {
	Interf i = (a,b)->{
		return a+b;
	};
	int i2 = i.add(10, 20);
	System.out.println(i2);
	Interf i3 = (a,b)->{
		return a*b;
		
	};
	int a = i3.add(10,10);
	System.out.println(a);
	
	
	

		
	

}}
