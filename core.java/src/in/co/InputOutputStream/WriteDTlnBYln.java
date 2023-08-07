package in.co.InputOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteDTlnBYln {
	public static void main(String[] args) throws IOException {
		FileWriter w = new FileWriter("C:\\Users\\hp\\Desktop\\ballu1\\kk.txt");
		PrintWriter p = new PrintWriter(w);
		
		for(int i = 0; i < 10; i++) {
		p.println(":ABHI BOHOT KUCH BAKI H");
		//(i+":ABHI BOHOT KUCH BAKI H");
		
	}
	p.close();
	w.close();
	System.out.println("done");
		
		
		
		
		
		
		
	}

}
