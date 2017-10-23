package referenceType;

public class MethodEx {
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		
		System.out.println(myClass1.getNum());
		
		myClass1.setNum(3);
		System.out.println(myClass1.getNum());
		
		System.out.println(myClass1.getName());
		myClass1.setName("로제");
		System.out.println(myClass1.getName());
		
		System.out.println(myClass1.getClassName());
		System.out.println(myClass2.getClassName());
		System.out.println(MyClass.getClassName());
		
//		someMethod();
	}
	
	public static void staticMethod() {
		
	}
	public void someMethod() {
		staticMethod();
	}
}







