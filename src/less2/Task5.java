package less2;

public class Task5 {

	public static void main(String[] args) {
		// Вывести на экран первые 11 членов последовательности Фибоначчи
		int x=1, y=1, z;
		System.out.print(x + " " + y);
		for (int i=1; i<10; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		}

	}

}
