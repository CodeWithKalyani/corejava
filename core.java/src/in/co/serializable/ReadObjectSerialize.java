package in.co.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectSerialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\hp\\Desktop\\ballu1\\kk.txt");
		ObjectInputStream o = new ObjectInputStream(f);
		MarksheetSerializable n = (MarksheetSerializable) o.readObject();

		System.out.println(n.name);
		System.out.println(n.maths);
		System.out.println(n.physics);
		System.out.println(n.chemistry);

		o.close();
		f.close();
	}

}
