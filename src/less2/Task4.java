package less2;

public class Task4 {

	public static void main(String[] args) {
		// ���������, �������� �� ����������� ����� �������
		int x=-12;
		for (int i=2; i < ((int)Math.abs(x) - 1); i++)
		{
			if (x%i == 0) {
				System.out.println(x + " �� �������� �������");
				return;
				}
		}
		System.out.println(x + " �������� �������");
	}

}
