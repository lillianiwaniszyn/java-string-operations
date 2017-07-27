//takes 2 parameters and returns true if they are anagrams of each other, returns false otherwise
//ascii values were summed to see if they are equal (thus an anagram)

public class AreStringsAnagrams {
	public boolean isAnagram(String a, String b) {
		String[] input1 = a.split("");
		String[] input2 = b.split("");
		int asciiSum1 =0;
		int asciiSum2 =0;
		
		for(String x : input1) {
			char character = x.charAt(0); 
			int ascii = (int) character; 
			asciiSum1 = asciiSum1 + ascii;
		}
		for(String y : input2) {
			char character = y.charAt(0); 
			int ascii = (int) character; 
			asciiSum2 = asciiSum2 + ascii;
		}

		
		if(asciiSum1 == asciiSum2) {
			return true;
		}
		else 
			return false;
	}

}
