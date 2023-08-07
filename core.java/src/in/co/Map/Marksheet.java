package in.co.Map;

public class Marksheet {
	private String rollno;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	public Marksheet() {
			}
	public Marksheet(String n,String r,int a,int b,int c) {
		this();
		this.maths=a;
		this.chemistry=b;
		this.physics=c;
		this.name=n;
		this.rollno=r;
	
}
	public String getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getPhysics() {
		return physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public int getMaths() {
		return maths;
	}

	
	}
