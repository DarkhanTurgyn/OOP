package problem3;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number;
		Data data = new Data();
		while(true) {
			number = in.next();
			if(number.equals("Q")) break;
			int newData = Integer.parseInt(number);			
			data.addData(newData);
		}
		System.out.println("Maximum = " + data.getLargest());
		System.out.println("Average = " + data.getAverageData());
		in.close();
	}

}
