package less1;

public class Task4 {

	public static void main(String[] args) {
		// ������� ��������� � 10 �� ���� �����
		double m = 10.45;
		double n = 10.5;
		String str = (Math.abs(m-10)<Math.abs(n-10)) ? (m + " ����� � 10 ��� " + n) : (n + " ����� � 10 ��� " + m);
		System.out.println(str);

	}

}
