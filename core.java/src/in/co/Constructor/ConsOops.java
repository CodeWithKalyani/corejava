package in.co.Constructor;

public class ConsOops {
	private String Add;
	private String multi;
	private String div;

	public ConsOops() {
		System.out.println("I AM DEFAULT COSTRUCTOR");

	}

	public ConsOops(String c) {
		this();
		this.div = c;
		System.out.println("I AM PARAMETERISED COSTRUCTOR");

	}

	public ConsOops(String B, String A) {

		this("RAM");
		this.div = A;
		this.Add = B;
		System.out.println("I AM TWO PARAMETERISED COSTRUCTOR");

	}

	public String getAdd() {
		return Add;
	}

	public String getMulti() {
		return multi;
	}

	public String getDiv() {
		return div;
	}

}
