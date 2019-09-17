
public class Balance {

	public static void main(String[] args) {
		int balance = 215;
		int interest = 10;

		balance += balance * interest / 100;
		System.out.println("New balance: " + balance);

	}

}
