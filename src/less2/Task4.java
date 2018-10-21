package less2;

public class Task4 {

	public static void main(String[] args) {
		// Проверить, является ли натуральное число простым
		int x=125;
		for (int i=2; i < (x - 1); i++)
		{
			if (x%i == 0) {
				System.out.println(x + " не является простым");
				return;
				}
		}
		System.out.println(x + " является простым");
	}

}
