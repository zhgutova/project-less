package less2;

public class Task6 {

	public static void main(String[] args) {
		/*
		 � ������ N ������ � ������� �������������� �� �������� �������� �������. 
		 ������ ������ ���������� ���� ���������� � ������� ���������� ����� ������� � �������� �� 000001 �� 999999. 
		 ����������� ��������� ������� � �������� ����� ������ ��� ���� ������ ����� ����� ��������� ��� ����, 
		 ���, ��������, � ������� � �������� 003102 ��� 567576. ���������� ���� ������ �������� ������� ���������� 
		 ������� ����������� ������ � ������ �����������, ��� ����� ��������� �����������. � ������� ��������� 
		 ����������� ������� ���������� ������� � ����� ������?
		 */
		int count1 = 0, count2 = 0;
		//var1
		for (int a=0; a<10; a++)
			for (int b=0; b<10; b++)
				for (int c=0; c<10; c++)
					for (int d=0; d<10; d++)
						for (int e=0; e<10; e++)
							for (int f=0; f<10; f++)
		{
			if (a ==  0 & b == 0 & c == 0 & e == 0 & f == 0) {break;}
			if ((a+b+c)==(d+e+f))
			{
				//System.out.println(a+ " " + b + " " + c + " " + d + " " + e + " " + f);
				count1++;
			}
		}
		System.out.println(count1);
		//var2
		for (int i=1; i < 1000000; i++)
		{
			if (i%10 + i/10 % 10 + i/100 % 10 == i/1000 %10 + i/10000 % 10 + i/100000 % 10)
			{
				count2++;
			}
		}
		System.out.println(count2);
		
	}

}
