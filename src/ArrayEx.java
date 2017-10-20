
public class ArrayEx {
	public static void main(String[] args) {
		int[] myArray = new int[5];
		myArray[0] = 34;
		myArray[1] = 33;
		myArray[2] = 95;
		myArray[3] = 75;
		myArray[4] = 85;
//		myArray[5] = 85;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray[4]);
//		System.out.println(myArray[5]);
		
		byte[] byteArray = new byte[3];
		byteArray[0] = 100;
		
		System.out.println(byteArray[0]);
		System.out.println(byteArray[1]);
		System.out.println(byteArray[2]);
		
		int i;
		
//		System.out.println(i);
		
		
		int[] myArray2 = {2, 3874, -198734};
		
		System.out.println(myArray2.length);
		
		String str = "오늘 날씨가 좋다.";
		String[] strArray = new String[3];
		strArray[0] = "월요일";
		strArray[1] = "화요일";
		strArray[2] = "수요일";
		
		String[][] names = {
				{"Mr. ", "Mrs. ", "Ms. "},
				{"Smith", "Jones"}
		};
		System.out.println(names[1][0]);
		
		
		
	}
}










