package less10.Task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat("Cat1", 4, 8, 8);
		Cat cat2 = new Cat("Cat2", 3, 5, 8);
		System.out.println(cat1.fight(cat2));
		System.out.println(cat2.fight(cat1));
	}

}
