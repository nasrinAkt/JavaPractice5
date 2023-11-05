package secondPackage;

import firstPackage.Dallas;

public class Huntington extends Dallas{

	public static void main(String[] args) {
		Huntington tom = new Huntington();
		tom.happy(500);
		tom.happy(500, 500);
		Huntington.happy("Nasrin");
		Huntington.happy(500.99);
	}

}
