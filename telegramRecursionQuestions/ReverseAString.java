package assignments.telegramRecursionQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "ApniKaksha";
		reverse(s,0,s.length()-1);
		
	}
	
	public static void reverse(String s, int l , int r) {
		
/*		Base Condition is basically when the length of the string is 
 * 		1 - where we simply print the string.
 * 		2 - where we exchange the characters and then print the string.
 */
		if(l>=r) {
			System.out.println(s);
			return;
		}
		
//		In the following code we are exchanging the characters of the string pairwise from the end.
		
		char arr[] = s.toCharArray();
		char temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		s = String.valueOf(arr);
		reverse(s,l+1,r-1);
		
		
		
	}

}
