package less3;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		/*
		 �������� ������ �� ���� ������ ����� �� 2 �� 20 � �������� �������� ������� �� ����� ������� � ������, 
������� ���� ������� �� ������� ��������, � ����� � ������� (������� ���� ������� �� ������� ������� ����� ������). 
����� ��������� ������� ���������, ������ �� ����� �������. 2 4 6 � 18 20 2 4 6 � 20 
		 */
		
		int count = 0;
		for (int i = 1; i < 21; i++)
			if (i % 2 == 0) count++; //���-�� ������ ����� � ���������� 2..20
		
		//System.out.println(count);
		
		int [] arr;
		arr = new int [count];
		
		for (int i = 1; i < count + 1; i ++)
		{
			arr [i-1] = i*2;
		}

		//System.out.println(Arrays.toString(arr)); // ����� �������
		
		System.out.println("����� ��������� ������� � ������:");
		for (int i = 0; i < count; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.println("����� ��������� ������� � �������:");
		for (int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}

}
