package in.co.serializable;

public class TestMarksheetTransientExt {
	public static void main(String[] args) {
		MarksheetTransient M = new MarksheetTransient();
		M.setName("BALLU");
		M.setChemistry(70);
		M.setPhysics(80);
		M.setMaths(90);
		M.setTemp(100);
		System.out.println(M.name);
		System.out.println(M.temp);
	}

}
