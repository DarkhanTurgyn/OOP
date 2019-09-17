package problem5;

public class Problem5 {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);
		
		Car c2 = new Car(TypeOfCar.TRUCK);
		System.out.println(c2);
		
		Car c3 = new Car(TypeOfCar.CABRIOLET, "red");
		System.out.println(c3);
		
		Car c4 = new Car(TypeOfCar.ROADSTER, "orange", "black" , 4);
		System.out.println(c4);
	
		c4.Paint("dfas");
		c4.Paint("dsf", "dsfa", 45);
		c4.
	}

}
