package problem4;

public class Problem4 {

	public static void main(String[] args) {
		Time t = new Time(12, 10, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		Time t2 = new Time(7,59,8);
		t.add(t2);
		System.out.println();
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
	}

}
