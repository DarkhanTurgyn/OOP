import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int side = in.nextInt();
		in.close();

		int area = side * side;
		int perimeter = side * 4;
		double diagonal = Math.sqrt(2 * side * side);

		System.out.println(area);
		System.out.println(perimeter);
		System.out.println(diagonal);

	}

}
