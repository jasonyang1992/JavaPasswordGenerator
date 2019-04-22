package mainPackage;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Welcome to password Generator");
		PassGen start = new PassGen(); //Create Object
		
		for (int iCounter = 0; iCounter < 1; iCounter++) {
			try {		
				start.Generator();
			}
			catch (Exception e){
				System.out.println("------------------------------------");
				System.out.println("  Invalid Entry, Please Try again!");
				System.out.println("------------------------------------");
				iCounter--;
			}
		}
	}
}
