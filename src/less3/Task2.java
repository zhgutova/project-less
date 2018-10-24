package less3;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {

	public static void main(String[] args) {
		/*
		—оздайте массив из всех нечЄтных чисел от 1 до 99, выведите его на экран в строку, 
а затем этот же массив выведите на экран тоже в строку, 
но в обратном пор€дке (99 97 95 93 Е 7 5 3 1). 
		 */
		int count = 0;
		int tmp = 0;
		for (int i = 1; i < 100; i++)
			if (i % 2 != 0) count++; //кол-во нечетных в промежутке 1..99
		
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
