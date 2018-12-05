package less15.Task5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/*
 С консоли считать имя файла. 
Посчитать в файле количество запятых. Вывести информацию в консоль.
 */

public class Main {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите путь до файла");
		String filePath = sc.nextLine();
		File file = new File (filePath);
		sc.close();
		int cnt = 0;
	
		try (
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis))
		{
			byte[] buf = new byte[1024];
			
			while ((bis.read(buf)) != -1) {
				{for (int i = 0; i < buf.length; i++) {
				if (buf[i] == 44) 
					cnt++;}}
			}
			System.out.print("Количество запятых " + cnt);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
