package less10.Task6;

public class Instance {
	
	private String str = "getInstance()";
	/*
	 Создать класс с методом getInstance(), который возвращает один и тот же экземпляр данного класса. Создание объектов извне запретить!
	 */

	private Instance() {
	}

	public static void getInstance() {
		Instance inst = new Instance();
		System.out.println(inst.getClass());
		
	}
	
}
