package less_pattern.Task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Strategy strategy1 = new Strategy (new ConsoleLogger());
		Strategy strategy2 = new Strategy (new FileLogger());
		Strategy strategy3 = new Strategy (new TimeFileLogger());
		
		strategy1.write();
		strategy2.write();
		strategy3.write();
	}

}
