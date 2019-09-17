package problem5;

public class Car {
	public static final String CAR_MANUFACTURER = "FORD";
	public static int counter = 0;
	private int id;
	private TypeOfCar typeOfCar;
	private String color = "Black";
	private String additionalColor;
	private int patternId;    // 0 - no pattern 
	{
		counter++;
	}

	public Car(TypeOfCar typeOfCar, String color, String additionalColor, int patternId) {
		this(typeOfCar, color);
		this.additionalColor = additionalColor;
		this.patternId = patternId;
	}
	
	public Car(TypeOfCar typeOfCar, String color) {
		this(typeOfCar);
		this.color = color;
	}

	public Car(TypeOfCar typeOfCar) {
		this();
		this.typeOfCar = typeOfCar;
	}

	public Car() {
		id = counter;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getId() {
		return id;
	}
	
	public TypeOfCar getTypeOfCar() {
		return typeOfCar;
	}
	
	public void Paint(String color) {
		this.color = color;
		additionalColor = null;
		patternId = 0;
	}

	public void Paint(String color, String additionalColor, int patternId) {
		this.color = color;
		this.additionalColor = additionalColor;
		this.patternId = patternId;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", typeOfCar=" + typeOfCar + ", color=" + color + ", additionalColor="
				+ additionalColor + ", patternId=" + patternId + "]";
	}

	

	
}
