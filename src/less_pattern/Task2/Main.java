package less_pattern.Task2;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sensor sensor = new Sensor();
		sensor.add(new Green());
		sensor.add(new Yellow());
		sensor.add(new Red());
		
		for (int i = 0; i < 10; i++)
			sensor.notify((int) (Math.random() * 700));

		/*
Температура 652. Сработала сигнализация Green
Температура 652. Сработала сигнализация Yellow
Температура 652. Сработала сигнализация Red
Температура 224. Сигнализация Yellow отключена
Температура 224. Сигнализация Red отключена
Температура 383. Сработала сигнализация Yellow
Температура 232. Сигнализация Yellow отключена
Температура 678. Сработала сигнализация Yellow
Температура 678. Сработала сигнализация Red
Температура 82. Сигнализация Green отключена
Температура 82. Сигнализация Yellow отключена
Температура 82. Сигнализация Red отключена
Температура 595. Сработала сигнализация Green
Температура 595. Сработала сигнализация Yellow
		 */
		
	}

}
