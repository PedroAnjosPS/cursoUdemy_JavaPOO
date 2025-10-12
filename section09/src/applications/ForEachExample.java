package applications;

public class ForEachExample {

	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		System.out.println("===========================");
		System.out.println("          For Each         ");
		System.out.println("===========================");
		
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
