package collection;

import java.util.ArrayList;
import java.util.List;

public class MyMainGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("칼슘");
		list.add("칼륨");
		list.add("마그네슘");
		list.add("불소");
		
		char c = list.get(2).charAt(0);
		
		System.out.println(c);
	}
}
