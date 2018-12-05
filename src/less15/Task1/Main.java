package less15.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "";
		File file1, file2;
		
		while (!str1.endsWith(".txt")) {
		System.out.println("Введите путь и имя копируемого файла *.txt");
		str1 = sc.nextLine();
		}
        file1 = new File(str1);
        
        while (!str2.endsWith(".txt")) {
        System.out.println("Введите путь и имя нового файла *.txt");
		str2 = sc.nextLine();
        }
        file2 = new File(str2);
		sc.close();
		/*
        try(FileInputStream fis=new FileInputStream(file1);
                FileOutputStream fos=new FileOutputStream(file2))
        {
        	byte[] buf = new byte[fis.available()];
        	fis.read(buf); //чтение
        	fos.write(buf); //запись
            System.out.println("Скопировано байт (длина массива) " + buf.length);
            System.out.println("Скопировано байт (через реальное кол-во прочитанных байт)" + fis.read(buf));
        }
        catch(FileNotFoundException ex){ 
        	//ex.printStackTrace();
            System.out.println("Файл не найден / Отказано в доступе " + ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("другие исключения " + ex.getMessage());
        } */
		
		try(FileInputStream fis=new FileInputStream(file1);
                FileOutputStream fos=new FileOutputStream(file2))
		{
			System.out.println("Доступно байт для копирования " + fis.available());
			int i = -1;
			while ((i = fis.read()) != -1)
			{
				fos.write(i);
			}
		}
        catch(FileNotFoundException ex){ 
        	//ex.printStackTrace();
            System.out.println("Файл не найден / Отказано в доступе " + ex.getMessage());
        }
        catch(IOException ex){
            System.out.println("другие исключения " + ex.getMessage());
        }
		
    } 

}
