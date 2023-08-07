package core.java;

public class Testlogin {

	public static void main(String[] args) {
		String name = "RAM";
		if (name == "RAM") {
			System.out.println("valid");
		} else {
			try {
				throw new loginexeception();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
