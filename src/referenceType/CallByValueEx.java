package referenceType;

public class CallByValueEx {
	public static void main(String[] args) {
		int a = 0;
		
		modify(a);
		System.out.println(a);
		
		MyClass b = new MyClass();
		
		b.setName("리사");
		System.out.println(b.getName());
		
		modify(b);
		System.out.println(b.getName());
	}
	
	public static void modify(int i) {
		i = 3;
	}
	
	public static void modify(MyClass o) {
		o.setName("지수");
	}
}




