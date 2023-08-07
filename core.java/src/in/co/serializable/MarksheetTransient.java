package in.co.serializable;

import java.io.Serializable;

public class MarksheetTransient implements Serializable {
	public String name = null;
	public int physics = 0;
	public int maths = 0;
	public int chemistry = 0;
//	public transient int total = 0;
//	public transient double percentage = 0;
	public transient int temp = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
//	}
//	public int getTotal() {
//		return total;
//	}
//	public void setTotal(int total) {
//		this.total = total;
//	}
//	public double getPercentage() {
//		return percentage;
//	}
//	public void setPercentage(double percentage) {
//		this.percentage = percentage;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}
