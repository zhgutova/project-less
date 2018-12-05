package less15.Task4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.TreeSet;

/*
 Ввести с консоли имя файла. 
Считать все байты из файла. 
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите путь до файла");
		File file = new File (sc.nextLine());
		sc.close();
		TreeSet<Integer> set = new TreeSet<>();
	
		try (
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis))
		{
			byte[] buf = new byte[1024];
			
			while ((bis.read(buf)) != -1) {
				{for (int i = 0; i < buf.length; i++) 
				{
						set.add((int)buf[i]);
						//System.out.print(buf[i] +", ");
				}
				}
			System.out.println();
			System.out.print(set);
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
