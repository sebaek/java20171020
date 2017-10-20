
public class SwitchEx {
	public static void main(String[] args) {
		int month = 2;
		switch (month) {
		case 1:
			System.out.println("1월은 춥다.");
			break;
		case 2:
			System.out.println("2월도 춥다.");
			break;
		case 3:
			System.out.println("3월은 따뜻하다.");
			break;

		default:
			break;
		}
		
		String str = "추운 달";
		switch (str) {
		case "추운 달":
			System.out.println("1월과 2월");
			break;
		case "따뜻한 달":
			System.out.println("3월");
			break;

		default:
			break;
		}
		
		if (month == 1) {
			System.out.println("1월은 춥다.");
		} else if (month == 2) {
			System.out.println("2월도 춥다.");
		} else if (month == 3) {
			System.out.println("3월은 따뜻하다.");
		} 
		
	}
}
