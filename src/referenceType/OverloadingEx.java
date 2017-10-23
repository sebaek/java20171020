package referenceType;

public class OverloadingEx {

	public static void main(String[] args) {
		MyClass2 myObject = new MyClass2();
		myObject.print(10);
		myObject.print("갤럭시");
		myObject.print('c');
		myObject.print(1, 2);
		myObject.print(1, 2, 3);
		myObject.print(1, 2, 3, 4);
		
		int sum = myObject.sum(1, 2, 3,4, 5,6, 7, 8, 9, 10);
		
		System.out.println(sum);
	}
}
