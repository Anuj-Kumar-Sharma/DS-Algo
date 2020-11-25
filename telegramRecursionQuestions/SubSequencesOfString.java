package assignments.telegramRecursionQuestions;
import java.util.*;
public class SubSequencesOfString {
//Print all the subsequences of a string using recursion.
	static Set<String> sett = new HashSet<>();
	public static void main(String[] args) {
	
		
		
		String s = "hello";
		

		for(String a: getSubSequences(s,0)) {
			System.out.println(a);
		}
		
		
	}
	
	public static HashSet<String> getSubSequences(String s, int i){
		
		if(i>=s.length()) {
			return (HashSet<String>) sett;
		}
		
		int j = i+1;
		while(j<=s.length()) {
			
			sett.add(s.substring(i,j));
		
			j++;
			
		}
		getSubSequences(s, i+1);
		return (HashSet<String>) sett;
		 
	}}
	
	
		
	
	
