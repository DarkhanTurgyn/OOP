import java.util.Scanner;

public class Palindrome {
	public static Boolean isPal(String s) {
		for (int i = 0; i <= s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		if (isPal(s) == true) {
			System.out.println("Is Palindrome");
		} else
			System.out.println("NOPE");
	}

}
