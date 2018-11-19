package less10.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		/*
1. Программа должна считывать строки с клавиатуры.
и прекращать считывать данные после того как была введена строка "exit".
2. Если введенная строка содержит точку(".") и может быть корректно преобразована в число типа Double - 
должен быть вызван метод print(Double value).
3. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, 
но меньше 128 - должен быть вызван метод print(short value).
4. Если введенная строка может быть корректно преобразована в число типа Integer 
и полученное число меньше или равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
5. Во всех остальных случаях должен быть вызван метод print(String value).

		 */
		
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		Pattern patternDouble = Pattern.compile("-?[\\d]+[.][\\d]");
		Pattern patternShort = Pattern.compile("-?[\\d]+");
		
		while (!str.equals("exit")) {
			str = sc.nextLine();
			Matcher matcherDouble = patternDouble.matcher(str);
			Matcher matcherShort = patternShort.matcher(str);
			
			if ((matcherDouble.matches()) && (Double.valueOf(str) >= Double.MIN_VALUE)&& (Double.valueOf(str) <= Double.MAX_VALUE)) 
			System.out.println("Double " + Double.valueOf(str));
			
			else if ((matcherShort.matches()) && (Short.valueOf(str) >= Short.MIN_VALUE)&& (Short.valueOf(str) <= Short.MAX_VALUE)
					&& (Short.parseShort(str) > 0)&& (Short.parseShort(str) < 128)) 
				System.out.println("0 < short < 128 " + Short.parseShort(str));
			
			else if ((matcherShort.matches() && (Integer.valueOf(str) >= Integer.MIN_VALUE)&& (Integer.valueOf(str) <= Integer.MAX_VALUE) 
					&& ((Integer.valueOf(str) <= 0) || (Integer.valueOf(str) >= 128))))
				System.out.println("Integer " + Integer.valueOf(str));
			
			else if (!str.equals("exit"))
				System.out.println("string");
		}
		sc.close();
		
		
	}

}
