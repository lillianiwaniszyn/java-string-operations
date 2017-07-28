
/*this code returns the first non repeating value of a String as a String. 
It uses a hashmap to hash all the values, and if there is a collision, it will delete from the array, 
then return the first value in that array that is not a "*"*/
import java.util.HashMap;

public class GetFirstNRChar {

	public String getFirstNRChar(String a) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		String[] userInput = a.split("");

		for (String x : userInput) {

			char character = x.charAt(0);
			int ascii = (int) character;
			Object value = hmap.get(ascii);
			if (value == null && x != "*") {
				hmap.put(ascii, x);
			} else if (x == "*")
				break;
			else { // System.out.println(x);
				removeFromArray(userInput, x);
			}

		}
		for (String z : userInput) {
			if (!z.equals("*")) {
				return z;
			}

		}
		return null;

	}

	public String[] removeFromArray(String[] b, String c) {
		int count = 0;

		for (String d : b) {
			if (d.equals(c)) {
				b[count] = "*";

			}
			count++;

		}
		for (String q : b) {

		}

		return b;

	}

}
