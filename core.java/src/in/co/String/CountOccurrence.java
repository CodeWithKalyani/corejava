package in.co.String;

public class CountOccurrence {
	public static void main(String[] args) {
		String n = "aanshi";
		System.out.println(n);
		int count = 0;
		char ch ='a';
		for(int i=0; i < n.length(); i++){
			if (n.charAt(i)==ch) {
				count++;
				
				
			}
			
		}
		System.out.println("occurances of "+ ch +" are :"+count);
		
	}

}
