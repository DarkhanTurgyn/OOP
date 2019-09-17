package problem3;

public class Data {
	private double data = 0;
	private double largest = 0;
	private int cnt = 0;

	public void addData(double value) {
		data += value;
		cnt++;
		if (value > largest)
			largest = value;
	}

	public double getAverageData() {
		if(cnt==0) return 0;
		else return data / cnt;
	}

	public double getLargest() {
		return largest;
	}

}
