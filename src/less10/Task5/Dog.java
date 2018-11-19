package less10.Task5;

public class Dog implements Movable, Eatable, Eat {
	private String cl = "Dog";
	private int dist;
	private boolean isAlive = true;
	
	public Dog() {
	}

	private int getDist() {
		return dist;
	}

	private void setDist(int dist) {
		this.dist = dist;
	}

	private boolean isAlive() {
		return isAlive;
	}

	private void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.setDist(3);
	}

	@Override
	public void eat(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Cat)
			((Cat) obj).eaten();
		if (obj instanceof Mouse)
			((Mouse) obj).eaten();	
	}

	@Override
	public void eaten() {
		// TODO Auto-generated method stub
		System.out.println("Собака не может быть съедена");
	}

	
}
