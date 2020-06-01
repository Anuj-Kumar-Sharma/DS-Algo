package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);

		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(12);

		System.out.println(x.containsAll(y));

		System.out.println(x);
	}
}
