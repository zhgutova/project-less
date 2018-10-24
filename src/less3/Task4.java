package less3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 ������������ ������ ������� � ���������� ������ ������������� �����, � ��������� ������ ������� ������ ���������� ������� �� ��������� ����� ����� �� [-5;5] � ������� ��� �� ����� � ������. 
����� ����� ��������� ������ ���������� � �������� ������������ � ���, ����� ������� ����� �������� ������� ������: 
����� ��� ������, ���� ��������, ��� ��� ����� ������� �����. ���� ������������ ����� ������������ �����, 
�� ��������� ������ ��������� ���������� ����� �� ��� ���, ���� �� ����� ������� ���������� ��������. 
		 */

		int code;
		System.out.println("������� ������ ������������� �����");
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		
		while ((code <= 0)||(code % 2 != 0))
		{
			System.out.println("������� ������ ������������� �����");
			code = sc.nextInt();
		}
		
		int[] arr;
		arr = new int[code];
		
		for (int i = 0; i < code; i++)
			arr[i] = -5 + (int)(Math.random()*11);
		
		System.out.println(Arrays.toString(arr));
		
		int sumL = 0, sumR = 0; //����� ����� � ������ ��������
		
		
		for (int i = 0; i < code; i++)
		{
			if (i < code/2) sumL = sumL + (int)Math.abs(arr[i]);
			else sumR = sumR + (int)Math.abs(arr[i]);
		}
		
	//	System.out.println(sumL + " " + sumR);
		
		if (sumL == sumR) System.out.println("����� ������� ����� �������� ������� ����� ����� ������� ������");
		else if (sumL > sumR) System.out.println("����� ������� ����� �������� ������� " + sumL + " ������ ����� ������� ������ " + sumR);
		else System.out.println("����� ������� ����� �������� ������� " + sumL + " ������ ����� ������� ������ " + sumR);
	}

}
