package less3;

import java.util.Scanner;

public class TaskStr1 {

	public static void main(String[] args) {
		/*
		 1) ����� � ������ ��������� ��������� � �������� �� �� �����. 
������, �� ��������� ��� ������ � ����� ��������� ������ ������������. 
		 */

		System.out.println("������� ������");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("� ������� ����� �������� ���������");
		String strSub = sc.nextLine();		
		System.out.println("�� ���������");
		String strSubN = sc.nextLine();	
		String strN = str.replaceAll(strSub, strSubN);
		System.out.println("�������� ������:" );
		System.out.println(strN);
		sc.close();
		
		/*
		 2) ��������� ������� �� ��� ������������� ������� � ��� �������. 
		 */
		
        // �������� ��� ����� �� ������ *.replaceAll("[0-9]+", " ");
        // �������� ��� ����� �� ����� 123 *.replaceAll("[a-zA-Z]+", "123");
		
	//	String strN = "��������   ��k���";
		System.out.println("������� �������:");
		String strN1 = strN.replaceAll("\\s", "");
	//	int count = 0;
		
		System.out.println(strN1);
		StringBuffer sb = new StringBuffer(strN1);
		for (int i = 0; i < sb.length(); i++)
			for (int j = i + 1; j < sb.length(); j++)
			if (sb.charAt(i) == sb.charAt(j)) 
				{
				//	count++;
				//	System.out.println(i + " " +j);						
					sb.deleteCharAt(j);
					j--;
				}	
		System.out.println("������� ��������� ��������:");
		System.out.println(sb.toString());		
	//	System.out.println(count);	
		
	}

}
