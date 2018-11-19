package less10.Task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 - Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный пес)
- вес, цвет, адрес (домашний пес)
 */
		Dog dog1 = new Dog ("Dog1");
		Dog dog2 = new Dog ("Dog2",7,10);
		Dog dog3 = new Dog ("Dog2",2);
		Dog dog4 = new Dog (3, "blond");
		Dog dog5 = new Dog (3, "brown", "RUS");
		
		System.out.println("Кол-во объектов " + Dog.getDogCount());
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		System.out.println(dog4.toString());
		System.out.println(dog5.toString());
		}

}
