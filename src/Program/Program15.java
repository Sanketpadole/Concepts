package Program;

public class Program15 {

	public static void main(String[] args) {
		String s = "India Is My Country";

		for (int i = 0; i < s.length(); i++) {

			// char ch = s.charAt(i);
			// System.out.println("char" + ch);
			s = s.replaceAll(" ", "");

			char ch = s.charAt(i);
			// for (ch = 0; ch < s.length(); ch++) {
			if (s.charAt(i) != 0) {
				for (int i1 = 0; i1 < s.length(); i1++) {
					System.out.print(" " + s.charAt(i));
					break;
				}
			}
		}
	}

}

//op=I nd iaI sMyC ountr