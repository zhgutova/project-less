package less3;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		/*
		 �������� ������ �� 15 ��������� ����� ����� �� ������� [0;9]. �������� ������ �� �����. 
����������� ������� � ������� ������ ��������� � �������� ��� ���������� �� ����� �� ��������� ������
		 */

		int count = 0;
		int[] arr;
		arr = new int[15];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random()*10); // 0.0 <= Math.random() < 1.0
			
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0) count++; //���-�� ������ ���������
		
		System.out.println("���-�� ������ ��������� � ������� " + count);
		
	}

}
