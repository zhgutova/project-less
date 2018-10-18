package less1;

public class Task4 {

	public static void main(String[] args) {
		// Вывести ближайшее к 10 из двух чисел
		double m = 10.45;
		double n = 10.5;
		String str = (Math.abs(m-10)<Math.abs(n-10)) ? (m + " ближе к 10 чем " + n) : (n + " ближе к 10 чем " + m);
		System.out.println(str);

	}

}
