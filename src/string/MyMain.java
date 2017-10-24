package string;

public class MyMain {
	public static void main(String[] args) {
		// String에 관련한 메소드를 적절히 확인하고 사용하라.api 참조
		// String 비교는 equals를 사용해서 비교해라.
		String str = "   my text  ";
		String str1 = "text";
		String str2 = "text";
		String str3 = new String("text");
		
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.indexOf("my"));
		System.out.println(str.length());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 5));
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		
		
	}
}
