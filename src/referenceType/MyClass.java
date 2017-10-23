package referenceType;

public class MyClass {
	private int num;
	private String name;
	
	private static String staticVar;
	
	public MyClass() {
		this.num = 5;
		this.name = "삼다수";
	}
	
	public MyClass(int num) {
		this();
		this.num = num;
//		this.name = "삼다수";
	}
	
	public MyClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	/* method 정의 방법 
	 * 접근지정자 리턴타입 메소드명(파라미터타입과 이름,) {
	 *     ...중괄호 안에 실행될 코드들....
	 *     return 리턴타입에 맞는 값;//만약 void이면 생략가능.
	 * }
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
//		System.out.println(getClassName());
//		System.out.println(staticVar);
		return this.name;
	}
	
	public static String getClassName() {
		System.out.println(staticVar);
		
		return "이 클래스는 MyClass이다.";
		
	}
	
	
}







