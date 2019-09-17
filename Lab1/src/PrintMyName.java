import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		in.close();

		String border = "+";
		for (int i = 0; i < name.length(); i++) {
			border += '-';
		}
		border += '+';

		System.out.println(border);
		System.out.println('|' + name + '|');
		System.out.println(border);

	}

}
