//takes String and returns int. If String contains non numeric characters, an exception will be thrown
public class Atoi {
	
	public int atoi(String a) {
		String b = a.replaceAll("[^0-9]","");
		if (a.length() != b.length()) {
			throw new ClassCastException();
		}
		else {
			return Integer.parseInt(a);
			
		}

		
	}

}
