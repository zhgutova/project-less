package less2;

public class Task5 {

	public static void main(String[] args) {
		// ������� �� ����� ������ 11 ������ ������������������ ���������
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
