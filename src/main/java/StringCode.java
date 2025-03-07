import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 *
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
			int maxLen = 1;
			int len = 1;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(i - 1)) {
					len++;
				} else {
					maxLen = Math.max(maxLen, len);
					len = 1;
				}
			}
			return Math.max(maxLen, len);
		}
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 *
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str){

	StringBuilder ans = new StringBuilder();
			for(int i = 0; i<ans.length();i++){
		char s = ans.charAt(i);
		if (Character.isDigit(s)) {
			if (i < str.length() - 1) {
				char next = str.charAt(i + 1);
				int soCanChen = Character.getNumericValue(s);
				for (int j = 0; j < soCanChen; j++) {
					ans.append(next);
				}
				i++;
			}
		} else {
			ans.append(s);
		}
	}
			return ans.toString();
}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
			if (len <= 0 ||len>Math.min(a.length(), b.length())) {
				return false;
			}
			Set<String>sub= new HashSet<>();
			for (int i = 0; i <= a.length() - len; i++) {
				String subS = a.substring(i, i + len);
				sub.add(subS);
			}
			for (int i = 0; i <= b.length() - len; i++) {
				String subString = b.substring(i, i + len);
				if (sub.contains(subString)) {
					return true;
				}
			}
			return false;
		 // YOUR CODE HERE
	}

	public static void main(String[] args) {
		System.out.println(maxRun("trungnnnnn"));
	}
}
