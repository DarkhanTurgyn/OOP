package problem1;

public class Student {
	private String name;
	private String id;
	private int yearOfStudy = 1;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Student() {}

	public String getName() {return name;}

	public String getId() {return id;}

	public void incrementYearOfStudy() {yearOfStudy++;}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", yearOfStudy=" + yearOfStudy + "]";
	}

}
