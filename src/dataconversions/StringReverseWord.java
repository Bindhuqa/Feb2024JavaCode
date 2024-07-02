package dataconversions;

public class StringReverseWord {

	public static void main(String[] args) {

		String s = "this is my java code";
		String ss[] = s.split(" ");
		String rev = "";
		for (String e : ss) {
			rev = rev + StringReverseTest.reversestring(e) + " ";
		}
		System.out.println(rev.trim());

		String s1 = "this is my java code";
		String ss1[] = s1.split(" ");
		String nwstring = "";
		for (String e : ss1) {
			nwstring = nwstring + e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase())+" ";
		}
        System.out.println(nwstring.trim());
	}

}
