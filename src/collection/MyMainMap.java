package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMainMap {
	public static void main(String[] args) {
		Map map  = new HashMap();
		
		map.put("첫번째", 3);
		map.put("두번째", 3);
		map.put("두번째", "마그네슘");
		map.put("세번째", "불소");
		
		System.out.println(map.get("두번째"));
		
		Set set = map.keySet();
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
		
		map.remove("세번째");
		
		System.out.println(map.get("세번째"));
		
		
	}
}


