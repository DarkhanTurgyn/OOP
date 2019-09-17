package Problem1;

public class Temperature {
	private double value;
	private char scale;

	Temperature(double value, char scale) {			//Constructors
		if (isValidScale(scale))
			this.scale = scale;
		else
			System.out.println("ERROR: scale could be 'F' or 'C'");
		this.value = value;
	}

	Temperature(char scale) {						
		this(0, scale);
	}

	Temperature(double value) {
		this(value, 'C');
	}

	Temperature() {
		this(0, 'C');
	}

	public void setValue(double value) {			//(2) Setter methods
		this.value = value;
	}

	public void setScale(char scale) {
		if (isValidScale(scale))
			this.scale = scale;
		else
			System.out.println("ERROR: scale could be 'F' or 'C'");
	}

	public void setTemperature(double value, char scale) {
		setValue(value);
		setScale(scale);
	}

	public double getDegreeC() {					//(1) Conversion methods
		if (scale == 'C')
			return value;
		else
			return 5 * (value - 32) / 9;
	}

	public double getDegreeF() {
		if (scale == 'D')
			return value;
		else
			return (9 * value) / 5 + 32;
	}
	
	public char getScale() {						//(3)
		return scale;
	}

	private boolean isValidScale(char scale) {		//Check for valid scale
		if (scale == 'C' || scale == 'F')
			return true;
		else
			return false;
	}
}
