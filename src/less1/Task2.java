package less1;

public class Task2 {

	public static void main(String[] args) {
		// ������� ������� garden 10 ����� ������ �� ������ gardenBed 15 �� 25 ������. ������� ���-�� freeGardenBed ��������� �2
		
		int garden = 10 * 100; // 1 ����� = 100 �^2
		int countGardenBed = garden / (15*25); //���-�� ������
		int freeGardenBed = garden - (countGardenBed*(15*25));
		System.out.println("�� ������� 10 �����, �������� �� ������ 15*25 �, �� ������ " + freeGardenBed + "�^2");
		

	}

}
