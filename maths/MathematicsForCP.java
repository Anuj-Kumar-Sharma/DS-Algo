package maths;

import java.util.Arrays;

public class MathematicsForCP {

	public static void main(String[] args) {
		
//		boolean isPrime[] = seiveOfEratoSthenes(20);
//		for(int i = 0; i<=20; i++) {
//			System.out.println(i +" " + isPrime[i]);
//		}
		
//		System.out.println(gcd(24, 60));
		
		System.out.println(fastPower(3978432, 5, 1000000007));
		
	}	
	
	static long fastPower(long a, long b, int n) {
		
		long res = 1;
		
		while ( b > 0) {
			
			if ( (b&1) != 0) {
				res = (res * a % n) % n;
			}
			
			a = (a % n * a % n) % n;
			b =  b >> 1;
		}
		
		return res;
		
	}
	
	
	static int gcd(int a, int b) {
		
		return a % b == 0 ? b : gcd ( b, a%b);
	}
	
	
	
	
	static boolean[] seiveOfEratoSthenes(int n) {
		
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i * i <= n; i++) {
			
			
			for(int j = 2*i; j<=n; j += i) {
				isPrime[j] = false;
			}
			
		}
		
		return isPrime;
		
	}

}
