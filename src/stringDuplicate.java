import java.util.*;

public class stringDuplicate {

	public static void main(String[] args) {
		System.out.println("Enter a String to check for duplicates");
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		duplicate(word);
	}
	
	public static void duplicate(String word) {
		
		HashMap<Character, Integer> letter = new HashMap<Character, Integer>();
		
		for(int i = 0; i < word.length(); i++)
		{
			if(letter.containsKey(word.charAt(i)))
			{
				int c = letter.get(word.charAt(i));
				letter.put(word.charAt(i), c + 1);
			}
			else
				letter.put(word.charAt(i), 1);
			
		}
		
		for(int i = 0; i < word.length(); i ++)
		{
			if(letter.get(word.charAt(i)) == 1)
				letter.remove(word.charAt(i));
		}
		
		System.out.println(letter.toString());
	}

}
