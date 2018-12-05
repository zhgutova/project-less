package less10.Task2_2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Написать программу со следующим функционалом:
Считывание 20 чисел с клавиатуры, 
сохранение их в список,
сортировка по трём другим спискам:
число нацело делится на 3, 
нацело делится на 2 и
все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.

Метод printList() должен выводить на экран все элементы всех списков с новой строки.
Метод printList(String listName) должен выводить на экран все элементы указанного списка

 */
public class Main{
	

	

public  void printList(String listName) {
	//if (listName.equals("arrList"))
		//System.out.println(arrList);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		ArrayList<Integer> arrList = new ArrayList<>();
		ArrayList<Integer> arrList2 = new ArrayList<>();
		ArrayList<Integer> arrList3 = new ArrayList<>();
		ArrayList<Integer> arrListAn = new ArrayList<>();
	
		System.out.println("Введите 20 чисел");
		for (int i = 0; i < 20; i++) {
			//int l = sc.nextInt();
			int l = ((int) (Math.random()*16));
			arrList.add(l);
		}
		
		
		for (Integer i : arrList) {
			if ((i % 2) == 0)
				arrList2.add(i);
			if ((i % 3) == 0)
				arrList3.add(i);
			if ((i % 2 != 0) && (i % 3 != 0))
				arrListAn.add(i);
		}
		
		System.out.println(arrList);
		
		sc.close();
		
	}

/*
	public void printList() {
		// TODO Auto-generated method stub
		System.out.println(arrList2);
		System.out.println(arrList3);
		System.out.println(arrListAn);
	}*/
	



}
