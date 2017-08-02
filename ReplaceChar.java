/**
 * This method takes 3 parameters, the sentence(in the form of a String) and the char we want to replace, and the char we want to replace it with
 * replace must be one char long, replacement can be as many as we want
 * uses an array and a StringBuilder to implement this 
 *
 */
public class ReplaceChar {
	
	public String replaceChar(String sentence, String replace, String replacement) {
		String [] myArray  = sentence.split("");
		int counter = 0;
		StringBuilder returnString = new StringBuilder();
		for (String s: myArray) {
			if (s.equals(replace)) {
				myArray[counter] = replacement;

			}
			counter++;
		}
		for (String x : myArray) {
			returnString.append(x);
		}
		return returnString.toString();
	}

}
