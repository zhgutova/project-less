package less3;

import java.util.Arrays;
import java.util.Scanner;

public class TaskStr3 {

	public static void main(String[] args) {
		/*
		 3) �������� ������, ���������� �����, ����� ��������������� ����� � ���� �������. 
��������� ��� �����, ������� ����������� � ������, ��������� � ��������� ������������� ������. 
		 */

		Scanner sc = new Scanner (System.in);
		System.out.println("������� �����");
		String str = sc.nextLine();
		sc.close();
		String tmp = "";
		int tmp_int = 0;
		int[] tmp_arr, arr;
		tmp_arr = new int[str.length()];
		int count = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			//���� ������� ������ - �����, � ��������� ������ ��������� ���
			if (Character.isDigit (str.charAt(i))) 
				 tmp+=str.charAt(i);
			//���� ������� ������ �� ����� � ��������� ������ �� �����, ����������� ������ � �����
			//� ���������� ��� � ������� ������� ����������� �������
			//� count ������� ���-�� ��������� ��� �������������� �������
			//����� �������� ��������� ������
			else if (tmp != "") 
			{
				  tmp_int = Integer.parseInt(tmp);
				  tmp_arr [count] = tmp_int;
				  count++;
			 	//  System.out.println("tmp_imt " + tmp_int);
			 	  tmp = "";

			}
			//���� ����� �� ����� ������ � ��������� ������ �� �����, ������ ��������� ����
			if ((i == str.length()-1)&&(tmp != ""))
			{
					  tmp_int = Integer.parseInt(tmp);
					  tmp_arr [count] = tmp_int;
					  count++;
				 //	  System.out.println("tmp_imt " + tmp_int);
			}

		}	
		// ������� ����� ������ � ���-��� ��������� � ������ ����� 
		arr = new int[count];
		// �������� �� ���������� ������� � ������� ��������� �����
		System.arraycopy(tmp_arr, 0, arr, 0, count);
		System.out.println(Arrays.toString(arr));
	}

}
