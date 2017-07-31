//returns true if String passed in contains only digits
//replaces all digits with the empty string, so if the string is empty, then that means it contained only digits and returned true

public class CheckIfDigits {
	public boolean checkIfDigits(String a) {
		
		String b = a.replaceAll("[0-9]","");
		if (b.equals("")) {
			return true;
		}
		else
		return false;
	}
	

}
