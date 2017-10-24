package typeConversion;

import java.io.Serializable;

public class MyMainRef {
	public static void main(String[] args) {
		Integer i = new Integer(3);
		Number n = i;
		Object o = i;
		Serializable s = i;
		Comparable<Integer> c = i;
		i = (Integer) n;
	}
}



