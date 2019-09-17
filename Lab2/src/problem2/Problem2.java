package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		StarTriangle st = new StarTriangle(n);
		System.out.println(st);

	}

}
