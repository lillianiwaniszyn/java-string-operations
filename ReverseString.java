
/*this piece of code takes a string and returns the reversed value of the String. this is done using an array and
writing to the new array backwards*/
public class ReverseString {
	
  public String reverseString(String a) {
		String[] myArray = a.split("");
		int i = myArray.length - 1;
		int j = 0;
		String[] newString = new String[myArray.length];
		while (i >= 0) {
			newString[j] = myArray[i];
			i--;
			j++;
		}
		String b = String.join("", newString);
		return b;

	}

}
