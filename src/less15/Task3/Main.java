package less15.Task3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 Задача 3 
a) Зашифровать/ дешифровать файл паролем (XOR) (посмотреть в интернете) 
b) Зашифровать/ дешифровать файл другим файлом 
 */
public class Main {
	
	public static void sh (File file, String str) throws IOException {
		File file_sh = new File("C://test//sh.txt");
		try(FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inbuff = new BufferedInputStream(fis))
		{
			byte[] buf = new byte[1024];
			byte[] key = str.getBytes();
			
			int len;
			
			while( (len = inbuff.read(buf)) > 0 ) {

			for (int i = 0; i < buf.length; i++) {
				buf[i] = (byte)(buf[i] ^ key[i % key.length]);
			}	
			
			try(OutputStream out = new FileOutputStream(file_sh))
			{
				out.write(buf, 0, len);
			}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void desh (File file, String str) throws IOException {
		File file_desh = new File("C://test//desh.txt");
		try(FileInputStream fis = new FileInputStream(file);
			BufferedInputStream inbuff = new BufferedInputStream(fis))
		{
			byte[] buf = new byte[1024];
			byte[] key = str.getBytes();
			
			int len;
			
			while( (len = inbuff.read(buf)) > 0 ) {

			for (int i = 0; i < buf.length; i++) {
				buf[i] = (byte)(buf[i] ^ key[i % key.length]);
			}	
			
			try(OutputStream out = new FileOutputStream(file_desh))
			{
				out.write(buf, 0, len);
			}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws IOException {
		File file = new File("C://test//1.txt");
		sh(file, "строка");
		File file_sh = new File("C://test//sh.txt");
		desh(file_sh, "строка");

	}

}
