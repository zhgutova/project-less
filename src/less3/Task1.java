package less3;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		/*
		 —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). 
ѕеред созданием массива подумайте, какого он будет размера. 2 4 6 Е 18 20 2 4 6 Е 20 
		 */
		
		int count = 0;
		for (int i = 1; i < 21; i++)
			if (i % 2 == 0) count++; //кол-во четных чисел в промежутке 2..20
		
		//System.out.println(count);
		
		int [] arr;
		arr = new int [count];
		
		for (int i = 1; i < count + 1; i ++)
		{
			arr [i-1] = i*2;
		}

		//System.out.println(Arrays.toString(arr)); // вывод массива
		
		System.out.println("¬ывод элементов массива в строку:");
		for (int i = 0; i < count; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		System.out.println("¬ывод элементов массива в столбец:");
		for (int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}

}
