package referenceType;

public class MyClass2 {
	
	public void print(int i) {
		System.out.println("integer type 출력 : " + i);
	}
	
	public void print(int i, int j) {
		System.out.println("integer type 출력1 : " + i);
		System.out.println("integer type 출력2 : " + j);
	}
	
	public void print(int... ars) {
		System.out.println("가변인자 출력");
		for (int n : ars) {
			System.out.println(n);
		}
	}
	
	public void print(String str) {
		System.out.println("String type 출력 : " + str);
	}
	
	public int sum(int... nums) {
		int result = 0;
		for (int num : nums) {
			result += num;
		}
		
		return result;
	}

}








