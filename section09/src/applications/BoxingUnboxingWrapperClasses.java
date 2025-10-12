package applications;

public class BoxingUnboxingWrapperClasses {

	public static void main(String[] args) {
		int x = 20;
		
		Integer obj = x;
		
		System.out.print("Boxing: " + obj + "\n");
		
		int y = obj * 2;
		
		System.out.print("Unboxing: " + y + "\n");

	}

}
