package problem1;

public class Problem1 {

	public static void main(String[] args) {
		Student student1 = new Student("Darkhan", "18BD11098");
		student1.incrementYearOfStudy();
		System.out.println(student1.getName());
		System.out.println(student1.getId());

		System.out.println(student1);
	}

}
