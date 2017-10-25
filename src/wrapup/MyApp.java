package wrapup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyApp {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.setName("리사");
		p1.setScore(300);
		
		p2.setName("제니");
		p2.setScore(400);
		
		p3.setName("로제");
		p3.setScore(500);
		
		p4.setName("지수");
		p4.setScore(600);
		
		p5.setName("유리");
		p5.setScore(200);
		
		List<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println(list);
		
		
		list.sort(new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getScore() - arg1.getScore();
			}
		});
		
		System.out.println("---정렬 후----");
		
		System.out.println(list);
		
	}
}
