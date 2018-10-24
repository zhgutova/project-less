package less3;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		/*
		 Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. 
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке
		 */

		int count = 0;
		int[] arr;
		arr = new int[15];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random()*10); // 0.0 <= Math.random() < 1.0
			
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % 2 == 0) count++; //кол-во четных элементов
		
		System.out.println("Кол-во четных элементов в массиве " + count);
		
	}

}
