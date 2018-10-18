package less1;

public class Task3 {

	public static void main(String[] args) {
		// Найти площадь овала oval3, полученного из овала oval1 15 дм^2 вырезанием овала площадью oval2 600 см^2
		
		int oval1 = 15 *100; // 1 дм^2 = 100 см^2
		int oval2 = 600;
		int oval3 = oval1 - oval2;
		System.out.println("Площадь овала, полученного вырезанием " + oval2 + "см^2 из " + oval1 + "см^2 = " + oval3);

	}

}
