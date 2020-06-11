package lists;

// we have used generics of type X and Y
public class Pair<X, Y> {		

	// declared varible x of type X and y of type Y
	X x;	
	Y y;		
	
	// created a constructor Pair with two parameteric variable x and y of type X and Y respectively
	
	public Pair(X x, Y y) {	
		
		// assigning the value global variable x and y with 'this' keyword
		
		this.x = x;		
		this.y = y;		
	}
	
	// created method getDescription with public access modifier and void return type void
	
	public void getDescription() {		
		
		// printing value of x and y of global variable
		
		System.out.println(x +" and " + y);	

}
