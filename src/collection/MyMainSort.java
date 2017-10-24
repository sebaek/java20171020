package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyMainSort {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(-6);
		list.add(9);
		list.add(0);
		
		int i = list.get(0);
		
		System.out.println(list);
		// class 만든 후 인스턴스 생성
		list.sort(new MyComparator());
		
		// 무명 클래스 만들고 인스턴스 생성
		list.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			};
		});
		
		// lambda 
		list.sort((Integer o1, Integer o2) -> o1 - o2);
		
		System.out.println(list);
	}
}


