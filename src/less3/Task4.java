package less3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*
		 Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. 
После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: 
левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, 
то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение. 
		 */

		int code;
		System.out.println("Введите четное положительное число");
		Scanner sc = new Scanner(System.in);
		code = sc.nextInt();
		
		while ((code <= 0)||(code % 2 != 0))
		{
			System.out.println("Введите четное положительное число");
			code = sc.nextInt();
		}
		
		int[] arr;
		arr = new int[code];
		
		for (int i = 0; i < code; i++)
			arr[i] = -5 + (int)(Math.random()*11);
		
		System.out.println(Arrays.toString(arr));
		
		int sumL = 0, sumR = 0; //сумма левой и правой половины
		
		
		for (int i = 0; i < code; i++)
		{
			if (i < code/2) sumL = sumL + (int)Math.abs(arr[i]);
			else sumR = sumR + (int)Math.abs(arr[i]);
		}
		
	//	System.out.println(sumL + " " + sumR);
		
		if (sumL == sumR) System.out.println("Сумма модулей левой половины массива равна сумме модулей правой");
		else if (sumL > sumR) System.out.println("Сумма модулей левой половины массива " + sumL + " больше суммы модулей правой " + sumR);
		else System.out.println("Сумма модулей левой половины массива " + sumL + " меньше суммы модулей правой " + sumR);
	}

}
