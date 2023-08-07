package in.co.InputOutputStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyBoard {
	public static void main(String[] args) throws IOException {
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader B = new BufferedReader(I);
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\hp\\Desktop\\ballu1//RDBYKYBRD.TXT"));
		String line = B.readLine();
		while (!line.equalsIgnoreCase("ballu")) {
			out.println(line);
			line = B.readLine();
		}
		out.close();
		B.close();

	}
}
