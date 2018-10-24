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
		String tmp = "";
		int tmp_int = 0;
		int[] tmp_arr, arr;
		tmp_arr = new int[str.length()];
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (i + 1 == str.length()) System.out.println("!!!");
			if (Character.isDigit (str.charAt(i))) 
		 {
		//	 count++;
			 tmp+=str.charAt(i);
			 System.out.println(i + " tmp " + tmp);
		 }
		 
		 else {
			  if (tmp != "") 
			  	{ 
				  tmp_int = Integer.parseInt(tmp);
				  tmp_arr [count] = tmp_int;
				  count++;
			 	  System.out.println("tmp_imt " + tmp_int);
			 	tmp = "";
		//	 	tmp_int = 0;
			 		}
		}}
		System.out.println(count);
		//System.out.println(Arrays.toString(tmp_arr));
		
		arr = new int[count];
		System.arraycopy(tmp_arr, 0, arr, 0, count);
		System.out.println(Arrays.toString(arr));
	}

}
