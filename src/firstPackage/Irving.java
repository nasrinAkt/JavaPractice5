package firstPackage;

public class Irving extends Dallas {

	public static void main(String[] args) {
		Irving tom = new Irving();
		tom.happy(500);
		tom.happy(500, 500);
		Irving.happy("Nasrin");
		
		Irving.happy(500.99);
	}

}
