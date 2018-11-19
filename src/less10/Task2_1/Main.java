package less10.Task2_1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Написать программу со следующим функционалом:
Считывание максимум 5 строк с клавиатуры, 
занесение строк в список,
поиск самой короткой строки,
вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
Если одинаково коротких строк несколько, выводить каждую с новой строки.

 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		String str = "";
		int min;
		Scanner sc = new Scanner (System.in);	
		System.out.println("Введите 5 строк");
	
		for (int i = 0; i < 5; i++) {
			str = sc.nextLine();
				list.add(str);
		}
		
		min = getMinStrIndex(list);
		System.out.println("Самая короткая строка: " + " -> " + list.get(min));
		System.out.println("Введите команду: для выхода - /exit, вывод короткой строки /short string");
		
		while (!str.equals("/exit")) {
			str = sc.nextLine();
			if (str.equals("/exit"))
				return;
			else if (str.equals("/short string"))
				getMinStr(list);
			else System.out.println("Нет такой команды");
		}

		sc.close();
		
	}

	  static int getMinStrIndex(ArrayList<String> list) {//индекс короткой строки
		int min = list.get(0).length();
		int minI = 0;
		for (String i : list) {
			if (i.length() <= min)
				minI = list.indexOf(i);
		}
		
		return minI;
	}
	 
	  static void getMinStr(ArrayList<String> list) {
		  ArrayList<String> shortStr = new ArrayList<String>();
		  int minL = getMinStrIndex(list); //индекс короткой строки
		  int minStrLen = list.get(minL).length(); //длина короткой строки
			for (String i : list) {
				if (i.length() == minStrLen)
					shortStr.add(i); //лист из всех коротких строк
			}
			for (String i : shortStr) {
				System.out.println(i);
			}			
		
		}
}
