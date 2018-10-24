package less3;

import java.util.Arrays;
import java.util.Scanner;

public class TaskStr3 {

	public static void main(String[] args) {
		/*
		 3) ¬водитс€ строка, содержаща€ буквы, целые неотрицательные числа и иные символы. 
“ребуетс€ все числа, которые встречаютс€ в строке, поместить в отдельный целочисленный массив. 
		 */

		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите текст");
		String str = sc.nextLine();
		sc.close();
		String tmp = "";
		int tmp_int = 0;
		int[] tmp_arr, arr;
		tmp_arr = new int[str.length()];
		int count = 0;

		for (int i = 0; i < str.length(); i++) 
		{
			//если текущий символ - цифра, к временной строки добавл€ем его
			if (Character.isDigit (str.charAt(i))) 
				 tmp+=str.charAt(i);
			//если текущий символ не цифра и временна€ строка не пуста, преобразуем строку в число
			//и записываем его в текущий элемент временнрого массива
			//в count считаем кол-во элементов дл€ целочисленного массива
			//после обнул€ем временную строку
			else if (tmp != "") 
			{
				  tmp_int = Integer.parseInt(tmp);
				  tmp_arr [count] = tmp_int;
				  count++;
			 	//  System.out.println("tmp_imt " + tmp_int);
			 	  tmp = "";

			}
			//если дошли до конца строки и временна€ строка не пуста, делаем описанное выше
			if ((i == str.length()-1)&&(tmp != ""))
			{
					  tmp_int = Integer.parseInt(tmp);
					  tmp_arr [count] = tmp_int;
					  count++;
				 //	  System.out.println("tmp_imt " + tmp_int);
			}

		}	
		// создаем новый массив с кол-вом найденных в строке чисел 
		arr = new int[count];
		// копируем из временного массива в целевой найденные числа
		System.arraycopy(tmp_arr, 0, arr, 0, count);
		System.out.println(Arrays.toString(arr));
	}

}
