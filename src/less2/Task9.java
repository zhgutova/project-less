package less2;

public class Task9 {

	public static void main(String[] args) {
		/* ������ ���������� ������� � ���������� ������� ��������. 
������ �������� ����������� �� ������� 0,5 �� ���� �������. 
� ����� �������� ������� ������� �������� �������� ����� ����� ������ ������� 
� ����� �������, ������� ������� ��������, ����� ������ �������� ����������� ��� ��������. */
		int countDish = 6, i=0;
		double countFairy = 2;
		while (countDish>0 & countFairy> 0.4)
		{
			countFairy = countFairy - 0.5;
			countDish--;
			i++;
			System.out.println("�������� ������� �������� " + countFairy + " ����� ����� ������� " + i);
		}
		System.out.println("�������� ������� " + countDish + " �������� ������� �������� " + countFairy);
	}

}
