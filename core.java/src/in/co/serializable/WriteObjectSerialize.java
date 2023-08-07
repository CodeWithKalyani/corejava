package in.co.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectSerialize {
	public static void main(String[] args) throws IOException {
		FileOutputStream a = new FileOutputStream("C:\\Users\\hp\\Desktop\\ballu1\\kk.txt");
		ObjectOutputStream b = new ObjectOutputStream(a);
		MarksheetSerializable m1 = new MarksheetSerializable();
		m1.name = ("shelly");
		m1.chemistry = (70);
		m1.maths = (80);
		m1.physics = (90);
		a.close();
		b.close();

		System.out.println("done");   

	}

}
