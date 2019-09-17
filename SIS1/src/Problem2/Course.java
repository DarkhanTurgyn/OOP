package Problem2;

import java.util.Arrays;

public class Course {
	private String name;
	private String description;
	private int numberOfCredits;
	private String[] prerequisites;
	
	Course(String name, String description, int numberOfCredits, String[] prerequisites){
		this.name = name;
		this.description = description;
		this.numberOfCredits = numberOfCredits;
		this.prerequisites = prerequisites;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", description=" + description + ", numberOfCredits=" + numberOfCredits
				+ ", prerequisites=" + Arrays.toString(prerequisites) + "]";
	}
	
	
}
