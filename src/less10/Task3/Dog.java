package less10.Task3;

public class Dog {
	/*
	 Создать класс Dog с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный пес)
- вес, цвет, адрес (домашний пес)

Задача конструктора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Какие свойства необходимо задать по умолчанию, а какие нет, определить самостоятельно

В классе реализовать счетчик создаваемых объектов и метод  int getDogCount(), который возвращает количество созданных объектов класса

	 */

	private String name = "noName";
	private int weight = 5;
	private int age = 2;
	private String color = "black";
	private String address = "missing";
	
	private static int count;
	public static int getDogCount() {
		return count;
	}
	
	public Dog (String name) {
		this.name = name;
		count++;
	}
	public Dog (String name, int weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
		count++;
	}	
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	public Dog (int weight, String color) {
		this.weight = weight;
		this.color = color;
		count++;
	}	
	public Dog (int weight, String color, String address) {
		this.weight = weight;
		this.color = color;
		this.address = address;
		count++;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + ", age=" + age + ", color=" + color + ", address=" + address
				+ "]";
	}
	
	
	
}
