package less_pattern.Task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 Используя паттерн Decorator создать шифрующие с помощью XOR потоки ввода/вывода. Они должны наследовать FilterInputStream и FilterOutputStream.
Конструктор этих потоков должен принимать пароль в виде массива байт и поток, который он декорирует.

Использование должно выглядеть следующим образом:
Трафик автоматически шифрует и дешифруется:
InputStream in = new CryptoInputStream(socket.getInputStream(), password);
OutputStream out = new CryptoOutputStream(socket.getOutputStream(), password);

Сохраняем в шифрованный файл и читаем из шифрованного файла:
InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), password);
OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), password);
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		byte [] password = "password".getBytes();
		
		try (
		InputStream in_shif = new CryptoInputStream(new FileInputStream("C:/test/1.txt"), password); //на вход - шифрованный
		OutputStream out = new CryptoOutputStream(new FileOutputStream("C:/test/12.txt"), password);//на выход - дешифрованный
	//	InputStream in = new CryptoInputStream(new FileInputStream("C:/test/1.txt"), password);
	//	OutputStream out_desh = new FileOutputStream("C:/test/123456.txt") //на выход, проверка - дешифрованный
				)	
		{
			int res;
		while ((res = in_shif.read()) != -1) {
			
			//System.out.print(in.read());
			out.write(res);
		}
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


	}

}
