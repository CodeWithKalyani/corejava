package in.co.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class MarksheetTransientExt extends  MarksheetTransient implements Externalizable {

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(maths);
		out.write(physics);
		out.write(chemistry);
		out.write(temp);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		physics = (int)in.read();
		maths = (int)in.read();
		chemistry = (int)in.read();
		temp = (int)in.read();
		// TODO Auto-generated method stub
		
	}

	
}
