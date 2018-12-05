package less14;

import java.util.Scanner;

public class Main {

	public static int plus(int a, int b) {
		return (a + b);
	}


	public static int minus(int a, int b) {
		return (a - b);
	}
	
	public static int umn(int a, int b) {
		return (a * b);
	}
	
	public static int del(int a, int b) throws Exception {
		if (b ==0)
			throw new Exception ("деление на 0");
			else
		return (a / b);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String x, y;
		int intX = 0, intY = 0;
		boolean ok = false;
		System.out.println(plus(7, 8));
		
		do {
		try {
			System.out.println("Введите цифру / команду 1");
			x = sc.next();
			intX = Integer.parseInt(x);	
			ok = true;
		}
		/*catch (NumberFormatException e) {
			System.out.println("!не число!");
		}*/
		catch (Exception e) {
		//	System.out.println("!exception! " /*+ e.toString()*/);
		}
		}
		while (!ok);
	
	ok = false;
	do {
	try {
		System.out.println("Введите цифру / команду 2");
		y = sc.next();
		intY = Integer.parseInt(y);	
		ok = true;
	}
	/*catch (NumberFormatException e) {
		System.out.println("!не число!");
	}*/
	catch (Exception e) {
	//	System.out.println("!exception! " /*+ e.toString()*/);
	}
	}
	while (!ok);
	sc.close();
	
	System.out.println(plus(intX, intY));
	System.out.println(minus(intX, intY));
	System.out.println(umn(intX, intY));
	try {
		System.out.println(del(intX, intY));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}

}
	
	

}
