import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		String ans;
		if(num > 100 || num < 0) ans="invalid";
		else if(num >= 95) ans = "A";
		else if(num >= 90) ans = "A-";
		else if(num >= 85) ans = "B+";
		else if(num >= 80) ans = "B";
		else if(num >= 75) ans = "B-";
		else if(num >= 70) ans = "C+";
		else if(num >= 65) ans = "C";
		else if(num >= 60) ans = "C-";
		else if(num >= 55) ans = "D+";
		else if(num >= 50) ans = "D";
		else ans = "F";
		System.out.println(ans);
	}

}
