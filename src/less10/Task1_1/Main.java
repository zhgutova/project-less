package less10.Task1_1;

/*
 Написать метод, который определяет, объект какого класса ему передали, 
и выводит на экран одну из надписей: Кошка, Собака, Птица.

 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat();
		Animal.get(cat);
		//System.out.println(cat.getClass().getSimpleName());
		Dog dog = new Dog();
		Animal.get(dog);
		Bird bird = new Bird();
		Animal.get(bird);
		
		String str = "строка";
		Animal.get(str);
		
		
	}
	
}
	class Cat {
		private String anim = "Cat";
		
		public Cat() {
		}
	}
	 class Dog {
		private String anim = "Gog";
			
		public Dog() {
		}
	}
	 class Bird {
		private String anim = "Bird";
			
		public Bird() {
		}
	}	
	 
	 class Animal {
		 
		 public static void get(Object obj) {
			 if (obj.getClass().getSimpleName().equals("Cat"))
				 System.out.println("Кошка");
			else if (obj.getClass().getSimpleName().equals("Dog"))
				 System.out.println("Собака");
			else if (obj.getClass().getSimpleName().equals("Bird"))
				 System.out.println("Птица");
			else System.out.println("Не животное");
		 }
	 }
	
	
	

