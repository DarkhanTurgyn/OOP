import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		int D = b * b - 4 * a * c;
		if (D < 0)
			System.out.println("No real solution: D is negative");
		else if (D == 0)
			System.out.println(-b / (2 * a));
		else {
			System.out.println((-b + Math.sqrt(D)) / 2 / a);
			System.out.println((-b - Math.sqrt(D)) / 2 / a);
		}

	}

}
