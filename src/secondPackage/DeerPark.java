package secondPackage;

import firstPackage.Dallas;

public class DeerPark extends Dallas{

	public static void main(String[] args) {
		DeerPark tom = new DeerPark();
		tom.happy(500);
		tom.happy(500, 500);
		
		DeerPark.happy("Nasrin");
		DeerPark.happy(500.99);
		
	}

}
