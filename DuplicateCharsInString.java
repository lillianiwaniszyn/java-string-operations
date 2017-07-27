/* Return a list of duplicates in a String
 Problem was solved using Hash Mapping. 
 Keys were calculated based on ascii value of character in String, and then if the key existed in the first hashmap, the 
 character was written to another hashmap(hmap2)*/
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class DuplicateCharsInString {
	public List<String> getDuplicates(String input) {
		String[] userInput = input.split("");
		List<String> duplicates = new ArrayList<String>();
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		for (String s : userInput) {
			char c = s.charAt(0);
			int ascii = (int) c;
			Object value = hmap.get(ascii);
			if (value == null) {
				hmap.put(ascii, s);
			} else {
				hmap2.put(ascii, s);
			}

		}
		Set set = hmap2.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			String duplicateValue = entry.getValue().toString();
			duplicates.add(duplicateValue);
		}

		return duplicates;
	}

}
