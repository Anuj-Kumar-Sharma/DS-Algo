package mathematics;

public class CatalanNumbers {
	
//	Catalan numbers = Sequence of natural no's that occurs in many 
//	interesting counting problems
	
//	eg : 1, 1, 2, 5, 14, 42, 132, 429, 1430....
//	C(0) = 1
//	C(n+1) = Σ C(i)*C(n-i) i=0 to n

//	C(4) = C(0)C(3) + C(1)C(2) + C(2)C(1) + C(3)C(0)
//		 = 14
	
	public static void main(String[] args) {
		
		System.out.println(catalanNumber(8));
		System.out.println(catalanNumbers(7));

	}
	
//	Method-1 Using Recursion 
//	Time complexity = Σ T(i)*T(n-i-1) i=0 to n-1
	
	static int catalanNumber(int n) {
		int res = 0 ;
		
		if(n <= 1) {
			return 1 ;
		}
		
		for(int i=0 ; i<n ; i++) {
			res += catalanNumber(i)*catalanNumber(n-i-1) ;
		}
		
		return res ;
	}

//	Method-2 Using Binomial Coefficient 
//	Time complexity = O(n)
	
	static int binomialCoefficient (int n , int r) {
		int res = 1 ;
		
		if(r > n-r ){
			r = n - r ; 
		}
		
		for(int i=0 ; i<r ; i++) {
			res *= n-i ;
			res /= i+1 ;
		}
		
		return res ;
	}
	
	static int catalanNumbers(int n) {
		return binomialCoefficient(2*n,n) / (n+1) ;
	}
}
