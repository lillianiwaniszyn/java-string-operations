//Takes String and prints number of consonants and number of vowels to the console
//Uses regex to accomplish this 
public class VowelsConsonants {
	
	public void vowelsConsonants(String a) {
		
		String b = a.replaceAll("[^A-Za-z]","");
		int count = b.length();
		String c = b.replaceAll("[aeiouAEIOU]","");

		int consonants = c.length();
		int vowels = count-consonants;
		System.out.println("String has " + consonants+ " consonants"+ " and " + vowels + " vowels" );
	}

}
