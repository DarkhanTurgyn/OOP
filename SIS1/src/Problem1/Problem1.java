package Problem1;

public class Problem1 {

	public static void main(String[] args) {
		Temperature t1 = new Temperature();
		System.out.println(t1.getDegreeF());
		t1.setTemperature(100, 'F');
		System.out.println(t1.getDegreeC());
	}

}
