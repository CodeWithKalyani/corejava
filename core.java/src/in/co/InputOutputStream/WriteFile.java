package in.co.InputOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\hp\\Desktop\\ballu1//ballu.txt");
		out.write("hey");
		out.write('\n');
		out.write(12);
		out.write('\n');
		out.write("hello");
		out.write('\n');
		out.write("hii");
		out.close();
		System.out.println("done");
	}

}
