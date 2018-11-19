package less10.Task2;

public class Cat {
	
	/*
	 Создать класс Cat. 
У кота должно быть имя (name, String), 
возраст (age, int), 
вес (weight, int), 
сила (strength, int).

Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самостоятельно.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true, 
то cat2.fight(cat1) = false

Сам метод fight не должен выводить данные на экран.

	 */

	private String name;
	private int age;
	private int weight;
	private int strength;
	
	public Cat(String name, int age, int weight, int strength) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.strength = strength;
	}
	
	public boolean fight(Cat anotherCat) {
		if ((this.strength*this.weight)/this.age > (anotherCat.strength*anotherCat.weight/anotherCat.age))
			return true;
			else return false;
	}
	
	
	
	
}
