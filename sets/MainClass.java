package sets;

import java.util.*;
<<<<<<< HEAD

=======
>>>>>>> 24de017... Initial commit
public class MainClass {

	public static void main(String[] args) {

		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(6);
<<<<<<< HEAD

		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(12);

		System.out.println(x.containsAll(y));

=======
		
		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(12);
		
		System.out.println(x.containsAll(y));
		
>>>>>>> 24de017... Initial commit
		System.out.println(x);
	}
}
