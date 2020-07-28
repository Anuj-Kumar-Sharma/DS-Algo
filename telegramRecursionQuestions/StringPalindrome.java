package assignments.telegramRecursionQuestions;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "Naman";
		if(isPalindrome(s,0,s.length()-1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
	
	public static boolean isPalindrome(String g, int l, int r) {

/* 		Base condition is when the length of the string is 
 *  	1 - which implies that the string will be a palindrome.
 *  	0 - which implies that there is no string so it can not be a palindrome.
 */
		
		
		String s = g.toLowerCase();
		char[] arr = s.toCharArray();
		if (arr.length==0) return false;
		if (arr.length==1) return true;
		
		
		if(arr[l]==arr[r] && l<=r) {
			isPalindrome(s,l+1,r-1);
			return true;
			
			
		}
		
		
		return false;
	}

}
