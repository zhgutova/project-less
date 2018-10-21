package less2;

public class Task1 {

	public static void main(String[] args) {
		// переставить числа в переменных a, b и c в строго возрастающей последовательности
		int a=3, b=9, c=-1, var;
		System.out.println("Ќачальные a="+a+" b="+b+" c="+c);
			if (a>c) {
				var = a;
				a = c;
				c = var;
			}
			if (a>b) {
				var = a;
				a = b;
				b = var;
			}
			if (b>c) {
				var = b;
				b = c;
				c = var;
			}
		System.out.println(" онечные a="+a+" b="+b+" c="+c);
	}
	}


