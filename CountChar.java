//counts number of chars in a String using a loop and an array
public class CountChar {
	
	public int countChar(String a, String b) {
		String [] myArray = a.split("");
		int count = 0;
		for(String x : myArray) {
			if(x.equals(b)) {
				count++;
			}
		}
		
		return count;
	}

}
