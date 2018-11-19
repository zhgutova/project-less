package less10.Task5;

/*
 Создать классы Dog, Cat и Mouse.
Реализовать интерфейсы (Movable, Eatable, Eat ) в классах, учитывая что:
- Кот может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь может передвигаться и может быть съедена.
- Собака может передвигаться и съесть кого-то.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Cat cat = new Cat();
		Mouse mouse = new Mouse();
		
		mouse.move();
		cat.move();
		dog.move();
		
		mouse.eat(dog);
		cat.eat(mouse);
		dog.eat(mouse);
		cat.eat(cat);
		dog.eat(cat);
		dog.eat(cat);
		
	}

}
