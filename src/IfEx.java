
public class IfEx {
	public static void main(String[] args) {
		// if
		int age = 30;
		if (age > 20) {
			System.out.println("too old");			
		}
		
		if (age <= 20) {
			System.out.println("too young");			
		}
		
		// if else
		age = 17;
		if (age > 20) {
			System.out.println("too old");
		} else {
			System.out.println("too young");
		}
		
		// if else if else
		if (age > 20) {
			System.out.println("too old");
		} else if (age > 15) {
			System.out.println("enough");
		} else {
			System.out.println("too young");
		}

		

	}
}
