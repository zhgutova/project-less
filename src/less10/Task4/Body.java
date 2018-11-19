package less10.Task4;

import java.util.Scanner;

public class Body {
	/*
	 Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализовать статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
"Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
"Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9

	 */
	
	private double growth;
	private double weight;
	
	private double imt;
	
	private void setGrowth(double growth) {
		if (growth <=0) {
			System.out.println("недопустимый рост");
			return;
		}
		else
			this.growth = growth;
	}
	
	private void setWeight(double weight) {
		if (weight <=0) {
			System.out.println("недопустимый вес");
			return;
		}
		else		
		this.weight = weight;
	}

	private double getGrowth() {
		return growth;
	}

	private double getWeight() {
		return weight;
	}

	private Body(double growth, double weight) {
		this.setGrowth(growth);
		this.setWeight(weight);
		this.imt = (this.weight/Math.pow(this.growth, 2));
	}
	
	private Body() {
		// TODO Auto-generated constructor stub
	}

	private static String input() {
		Scanner sc = new Scanner (System.in);
	//	sc.close();
		return (sc.nextLine());	
	}

	public static void IMT() {
		System.out.println("Введите рост ");
		String rost = input();
		System.out.println("Введите вес ");
		String ves = input();		
		Body body = new Body(Double.parseDouble(rost),Double.parseDouble(ves));
		//body.setGrowth(Double.parseDouble(rost));
	//	body.setWeight(Double.parseDouble(ves));
		
		//double imt = (this.weight/Math.pow(this.growth, 2));
		if (body.imt < 18.5)
			System.out.println("Недовес: меньше чем 18.5");
		else if (body.imt >= 18.5 && body.imt <= 24.9)
			System.out.println("Нормальный: между 18.5 и 24.9");
		else if (body.imt >= 25 && body.imt <= 29.9)
			System.out.println("Избыточный вес: между 25 и 29.9");
		else System.out.println("Ожирение: 30 или больше");
		
	}
	
	
	
	
	

}
