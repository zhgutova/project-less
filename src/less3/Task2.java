package less3;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {

	public static void main(String[] args) {
		/*
		�������� ������ �� ���� �������� ����� �� 1 �� 99, �������� ��� �� ����� � ������, 
� ����� ���� �� ������ �������� �� ����� ���� � ������, 
�� � �������� ������� (99 97 95 93 � 7 5 3 1). 
		 */
		int count = 0;
		int tmp = 0;
		for (int i = 1; i < 100; i++)
			if (i % 2 != 0) count++; //���-�� �������� � ���������� 1..99
		
		System.out.println(count);
		
		int [] arr;
		arr = new int[count];
		
		int [] arr_tmp;
		arr_tmp = new int[count/2];
		
		for (int i = 0; i < count; i++)
			arr[i] = 1 + 2 * i;
		
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < count/2; i++)
		{
			tmp = arr[i];
			//System.out.print(tmp + " ");
			arr [i] = arr [count - 1 - i];	
			arr [count -1 - i] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
