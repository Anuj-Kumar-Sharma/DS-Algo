package lists;

public class Pair<X, Y> {		// we have used generics of type X and Y

	X x;		// declared varible x of type X
	Y y;		// declared varible y of type Y
	
	public Pair(X x, Y y) {	// created a constructor Pair with two parameteric variable x and y of type X and Y respectively
		this.x = x;		// assigning the value global variable x with 'this' keyword
		this.y = y;		// assigning the value global variable y with 'this' keyword
	}
	
	public void getDescription() {		// created metho getDescription with public access modifier and void return type void
		System.out.println(x +" and " + y);	// printing value of x and y of global variable

	X x;
	Y y;

	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}

	public void getDescription() {
		System.out.println(x + " and " + y);

	}

}
