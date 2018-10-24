package less3;

import java.util.Scanner;

public class TaskStr1 {

	public static void main(String[] args) {
		/*
		 1) Найти в строке указанную подстроку и заменить ее на новую. 
Строку, ее подстроку для замены и новую подстроку вводит пользователь. 
		 */

		System.out.println("Введите строку");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("в которой нужно заменить подстроку");
		String strSub = sc.nextLine();		
		System.out.println("на подстроку");
		String strSubN = sc.nextLine();	
		String strN = str.replaceAll(strSub, strSubN);
		System.out.println("Итоговая строка:" );
		System.out.println(strN);
		sc.close();
		
		/*
		 2) Требуется удалить из нее повторяющиеся символы и все пробелы. 
		 */
		
        // заменяет все цифры на пробел *.replaceAll("[0-9]+", " ");
        // заменяет все буквы на слово 123 *.replaceAll("[a-zA-Z]+", "123");
		
	//	String strN = "теееекст   теkкст";
		System.out.println("Убираем пробелы:");
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
		System.out.println("Убираем повторные элементы:");
		System.out.println(sb.toString());		
	//	System.out.println(count);	
		
	}

}
