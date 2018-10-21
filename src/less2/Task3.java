package less2;

public class Task3 {

	public static void main(String[] args) {
		// вывести на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
		int x;
		for (int i=1; i<21; i++)
		{
			x = (int) Math.pow(2, i);
			System.out.print(x + " ");
		}
		
	}

}
