package secondPackage;

import firstPackage.Dallas;

public class Boston extends Dallas {

	public static void main(String[] args) {
		Boston tom = new Boston();
		tom.happy(500);
		tom.happy(500, 500);
		Boston.happy("Nasrin");
		Boston.happy(500.99);
	}

}
