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
		
		
	}

}
